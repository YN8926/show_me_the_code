package hz.simplejee.springframework.config.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by 辉辉大侠 on 29/10/2016.
 */
@Service
public class MyServiceImpl implements MyService {
    @Override
    public String sayHello(String foo) {
        return "Hello " + foo;
    }
}
