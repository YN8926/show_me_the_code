package hz.simplejee.dwr.hello.dwr;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.directwebremoting.Browser;
import org.directwebremoting.ScriptBuffer;
import org.directwebremoting.ScriptSession;
import org.directwebremoting.ScriptSessionFilter;
import org.directwebremoting.WebContextFactory;

public class Hello {

	private ConnectorMgrCenter center = new ConnectorMgrCenter();
	
	public String hello(String username) {
		System.out.println("--->" + username);
		return "Hello " + username;
	}
	
	public String async(final String uid, final HttpServletRequest request){
		new Thread(){
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(5);
					push(uid, "alert", request, new String[]{"辉辉大侠"});
				} catch (InterruptedException e) {
					// TODO Auto-enerated catch block
					e.printStackTrace();
				}
				
			};
		}.start();
		return "同步返回";
	}
	public void onPageLoad(String uid) {
		System.out.println(uid+"----------->");
		ScriptSession session = WebContextFactory.get().getScriptSession();
		session.setAttribute("scriptSessionId", uid);
		
		try {
			center.init();
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
	
	public void push(final String scriptSessionId, final String javascriptFunction, HttpServletRequest request, Object ...msg){
		final Object[] pushMsg = msg;
		Browser.withAllSessionsFiltered(new ScriptSessionFilter() {
			
			@Override
			public boolean match(ScriptSession session) {
				if(session.getAttribute("scriptSessionId") == null){
					return false;
				} else {
					return session.getAttribute("scriptSessionId").equals(scriptSessionId);
				}
			}
		}, new Runnable() {
			ScriptBuffer script = new ScriptBuffer();
			@Override
			public void run() {
				script.appendCall(javascriptFunction, pushMsg);
				Collection<ScriptSession> sessions = Browser.getTargetSessions();
				for(ScriptSession session:sessions) {
					session.addScript(script);
				}
				
			}
		});
	}
}
