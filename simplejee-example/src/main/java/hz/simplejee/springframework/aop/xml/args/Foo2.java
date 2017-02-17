package hz.simplejee.springframework.aop.xml.args;

/**
 * Created by wanghui on 17/02/2017.
 */
public class Foo2 {
    public String wrape(String name) {
        System.out.println("这是切面获取到的参数...." + name);
        return "Hello " + name;
    }
}
