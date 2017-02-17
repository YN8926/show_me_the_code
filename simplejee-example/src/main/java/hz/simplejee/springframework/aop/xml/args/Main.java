package hz.simplejee.springframework.aop.xml.args;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wanghui on 17/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext(Main.class.getResource("applicationContext.xml").toExternalForm());
        Foo foo = cxt.getBean(Foo.class);
        foo.sayHello("tt");
    }
}
