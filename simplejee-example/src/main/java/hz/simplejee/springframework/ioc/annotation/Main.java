package hz.simplejee.springframework.ioc.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wanghui on 13/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(MyConfig.class);
        MyService service = cxt.getBean(MyService.class);
        service.sayHello("辉辉大侠");
        cxt.close();
    }
}
