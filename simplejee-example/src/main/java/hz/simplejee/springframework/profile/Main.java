package hz.simplejee.springframework.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wanghui on 14/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext();
        cxt.getEnvironment().setActiveProfiles("dev");
        cxt.register(ProfileConfig.class);
        cxt.refresh();

        DemoBean bean = cxt.getBean(DemoBean.class);
        cxt.close();
    }
}
