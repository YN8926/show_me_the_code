package hz.simplejee.springframework.aop.annotation.around;

import org.springframework.stereotype.Component;

/**
 * Created by wanghui on 17/02/2017.
 */
@Component
public class Foo {

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
