package hz.simplejee.springframework.test.annoation;

import org.springframework.stereotype.Service;

/**
 * Created by wanghui on 29/11/2016.
 */
@Service
public class HelloService {

    public String sayHello(String name) {
        return "Hello::" + name;
    }
}
