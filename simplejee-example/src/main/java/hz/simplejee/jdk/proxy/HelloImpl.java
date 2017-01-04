package hz.simplejee.jdk.proxy;

/**
 * Created by wanghui on 6/5/16.
 */
public class HelloImpl implements Hello {
    public String sayHello(String username, String stmt) {
        return String.format("%s-->%s", username, stmt);
    }
}
