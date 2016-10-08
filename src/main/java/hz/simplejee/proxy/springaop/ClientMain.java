package hz.simplejee.proxy.springaop;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by wanghui on 6/5/16.
 */
public class ClientMain {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(new Greeting());
        factory.addAdvice(new GreetAdvice());
        Greeting greeting = (Greeting)factory.getProxy();
        System.out.println(greeting.sayGreeting("Mokala"));
    }
}
