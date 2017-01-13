package hz.simplejee.springframework.ioc.javaconfig;

/**
 * Created by wanghui on 13/01/2017.
 */
public class MyService {
    private FunctionService functionService;

    public MyService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public void sayHello(String name) {
        System.out.println(functionService.sayHello(name));
    }
}
