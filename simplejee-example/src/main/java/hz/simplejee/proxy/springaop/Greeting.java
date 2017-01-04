package hz.simplejee.proxy.springaop;

/**
 * Created by wanghui on 6/5/16.
 */
public class Greeting {
    public String sayGreeting(String username) {
        System.out.println(username);
        return "Hello, " + username;
    }
}
