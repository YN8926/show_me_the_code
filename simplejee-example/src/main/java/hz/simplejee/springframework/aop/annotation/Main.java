package hz.simplejee.springframework.aop.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by 辉辉大侠 on 29/10/2016.
 */
@Configuration
@ComponentScan(basePackages = "hz.simplejee.springframework.aop.annotation")
@EnableAspectJAutoProxy//开启Spring对AspectJ的支持
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(Main.class);
        MyService myService = cxt.getBean(MyService.class);
        myService.add();
        MyService2 bean = cxt.getBean(MyService2.class);
        bean.add();
        cxt.close();
    }
}
