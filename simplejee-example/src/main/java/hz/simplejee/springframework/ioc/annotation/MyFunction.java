package hz.simplejee.springframework.ioc.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by wanghui on 13/01/2017.
 */
@Service
public class MyFunction {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
