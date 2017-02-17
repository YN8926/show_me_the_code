package hz.simplejee.springframework.aop.xml;

/**
 * Created by wanghui on 17/02/2017.
 */
public class Boo {
    public void sayHello(String name) {
        if (name == null) {
            throw new RuntimeException("不能为空");
        }
        System.out.println("Say Hello to " + name);
    }
}
