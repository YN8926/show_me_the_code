package hz.simplejee.springframework.ioc.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wanghui on 13/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(JavaConfig.class);
        MyService bean = cxt.getBean(MyService.class);
        bean.sayHello("辉辉大侠2");
        cxt.close();
    }
}
