package hz.simplejee.proxy.cglib;

import java.lang.reflect.Method;

import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;

/**
 * Created by wanghui on 6/5/16.
 */
public class HelloMain {
    public static void main(String[] args) {
        CGLibProxy proxy = new CGLibProxy();
        Hello hello = proxy.getProxy(Hello.class);
        System.out.println(hello.sayHello("ceshi"));
    }

    static class CGLibProxy implements MethodInterceptor {

        public <T> T getProxy(Class<T> cls) {
            return (T) Enhancer.create(cls, this);
        }
        @Override
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
            System.out.println("before");
            Object result = proxy.invokeSuper(obj, args);
            System.out.println("after");
            return result;
        }
    }
}
