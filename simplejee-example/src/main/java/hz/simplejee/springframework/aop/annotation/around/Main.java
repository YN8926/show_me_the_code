package hz.simplejee.springframework.aop.annotation.around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by wanghui on 17/02/2017.
 */
@Configuration
@ComponentScan("hz.simplejee.springframework.aop.annotation.around")
@EnableAspectJAutoProxy
public class Main {

    public static void main(String[] args) {
        ApplicationContext cxt = new AnnotationConfigApplicationContext(Main.class);
        Foo foo = cxt.getBean(Foo.class);
        foo.sayHello("Mokala");
    }
}
