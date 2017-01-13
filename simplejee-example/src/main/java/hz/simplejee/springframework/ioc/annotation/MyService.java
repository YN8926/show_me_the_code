package hz.simplejee.springframework.ioc.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wanghui on 13/01/2017.
 */
@Service
public class MyService {
    @Resource
    private MyFunction function;

    public void sayHello(String name) {
        System.out.println(function.sayHello(name));
    }
}
