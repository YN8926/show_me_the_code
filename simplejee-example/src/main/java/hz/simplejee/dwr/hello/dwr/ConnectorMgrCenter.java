package hz.simplejee.dwr.hello.dwr;

import java.util.Map;

import javax.servlet.ServletException;

import org.directwebremoting.Container;
import org.directwebremoting.ScriptSession;
import org.directwebremoting.ServerContextFactory;
import org.directwebremoting.event.ScriptSessionEvent;
import org.directwebremoting.event.ScriptSessionListener;
import org.directwebremoting.extend.ScriptSessionManager;
import org.directwebremoting.servlet.DwrServlet;

import com.google.common.collect.Maps;

public class ConnectorMgrCenter extends DwrServlet {

	public static final Map<String, ScriptSession> scriptSessionMap = Maps.newHashMap();
	
	@Override
	public void init() throws ServletException {
		Container container = ServerContextFactory.get().getContainer();
		ScriptSessionManager mgr = container.getBean(ScriptSessionManager.class);
		ScriptSessionListener listener = new ScriptSessionListener() {
			
			@Override
			public void sessionDestroyed(ScriptSessionEvent ev) {
				ScriptSession session = ev.getSession();
				scriptSessionMap.remove(session.getId());
				System.out.println(">>>>>>>>>>>>>> Script Session destory. " + session.getId());
				System.out.println(">>>>>>>>>>>>>> Script Session destory. " + session.getId());
			}
			
			@Override
			public void sessionCreated(ScriptSessionEvent ev) {
				ScriptSession session = ev.getSession();
				scriptSessionMap.put(session.getId(), session);
				System.out.println(">>>>>>>>>>>>>> Script session created. " + session.getId());
			}
		};
		mgr.addScriptSessionListener(listener);
	}
}
