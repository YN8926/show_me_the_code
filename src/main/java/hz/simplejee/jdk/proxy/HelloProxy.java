package hz.simplejee.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wanghui on 6/5/16.
 */
public class HelloProxy implements InvocationHandler {

    private Object target;

    public HelloProxy(Hello hello) {
        target = hello;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        return "::" + result;
    }

    @SuppressWarnings("unchecked")
    public <T>T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }
}
