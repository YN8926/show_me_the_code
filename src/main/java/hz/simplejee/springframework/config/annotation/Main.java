package hz.simplejee.springframework.config.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 辉辉大侠 on 29/10/2016.
 */
@Configuration
@ComponentScan(basePackages = "hz.simplejee.springframework.config.annotation")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(Main.class);
        MyService service = cxt.getBean(MyService.class);
        System.out.println(service.sayHello("ceshi"));
    }
}
