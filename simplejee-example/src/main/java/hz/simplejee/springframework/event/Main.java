package hz.simplejee.springframework.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 辉辉大侠 on 29/10/2016.
 */
@Configuration
@ComponentScan("hz.simplejee.springframework.event")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(Main.class);
        DemoEventPublisher pub = cxt.getBean(DemoEventPublisher.class);
        pub.publish("测试Bean内部消息");
        cxt.close();
    }
}
