package hz.simplejee.springframework.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by 辉辉大侠 on 29/10/2016.
 */
@Component
public class MyService {
    @MyAnnotation(name = "ceshi")
    public void add(){}

    public void sub(){}
}
