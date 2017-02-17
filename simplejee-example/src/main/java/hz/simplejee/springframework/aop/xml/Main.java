package hz.simplejee.springframework.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wanghui on 17/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext(Main.class.getResource("applicationContext.xml").toExternalForm());
        Boo boo = cxt.getBean(Boo.class);
        boo.sayHello("huihuidaxia");
        System.out.println("##############");
        boo.sayHello(null);
    }
}
