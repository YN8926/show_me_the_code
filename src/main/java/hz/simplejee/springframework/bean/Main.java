package hz.simplejee.springframework.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 辉辉大侠 on 30/10/2016.
 */
@Configuration
@ComponentScan("hz.simplejee.springframework.bean")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(Main.class);
        AwareService service = cxt.getBean(AwareService.class);
        service.output();
        cxt.close();
    }
}
