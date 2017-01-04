package hz.simplejee.openfire.conversejs;

import com.tqmall.wheel.lang.QuickServer;

/**
 * Created by wanghui on 08/12/2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        QuickServer.createQuickWebServer(Main.class.getResource("webapp").getPath(), "/", 8080);
    }
}
