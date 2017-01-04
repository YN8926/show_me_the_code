package hz.simplejee.springframework.job;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by 辉辉大侠 on 30/10/2016.
 */
@Configuration
@EnableScheduling
@ComponentScan("hz.simplejee.springframework.job")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(Main.class);

    }
}
