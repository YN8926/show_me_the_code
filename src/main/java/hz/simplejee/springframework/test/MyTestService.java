package hz.simplejee.springframework.test;

/**
 * Created by 辉辉大侠 on 30/10/2016.
 */
public class MyTestService {
    private String prefix;

    public MyTestService(String prefix) {
        this.prefix = prefix;
    }

    public String sayHello(String hello) {
        return this.prefix + hello;
    }
}
