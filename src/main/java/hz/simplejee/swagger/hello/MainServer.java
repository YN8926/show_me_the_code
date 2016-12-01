package hz.simplejee.swagger.hello;

import com.tqmall.wheel.lang.QuickServer;
import hz.simplejee.utils.ResourcesUtils;

public class MainServer {
    public static void main(String[] args) throws Exception {
        QuickServer.createQuickWebServer(ResourcesUtils.getClassDir(MainServer.class) + "webapp", "/", 8099);
    }
}
