package hz.simplejee.springframework.aop.xml;

/**
 * Created by wanghui on 17/02/2017.
 */
public class Foo {
    public void before() {
        System.out.println("before----------");
    }

    public void before2() {
        System.out.println("before2--------");
    }
    public void after() {
        System.out.println("after-------------");
    }

    public void exceptionHandler() {
        System.out.println("exception---------");
    }
}
