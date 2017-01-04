package hz.simplejee.springframework.aop.annotation;

import java.lang.annotation.*;

/**
 * Created by 辉辉大侠 on 29/10/2016.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {
    String name();
}
