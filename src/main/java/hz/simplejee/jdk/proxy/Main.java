package hz.simplejee.jdk.proxy;

/**
 * Created by wanghui on 6/5/16.
 */
public class Main {
    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        HelloProxy proxy = new HelloProxy(hello);
        Hello helloProxy = proxy.getProxy();
        System.out.println(helloProxy.sayHello("Mokala", "ssss"));
    }
}
