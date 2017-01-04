package hz.simplejee.web.bootstrap3;

import hz.simplejee.utils.ResourcesUtils;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class MainServer {

	public static void main(String[] args) throws Exception{
		Server server = new Server(8090);
		WebAppContext webContxt = new WebAppContext();
		webContxt.setContextPath("/");
		webContxt.setWar(ResourcesUtils.getClassDir(MainServer.class) + "webapp");
		server.setHandler(webContxt);
		server.start();
		server.join();
	}
}
