package hz.simplejee.proxy.springaop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * Created by wanghui on 6/5/16.
 */
public class GreetAdvice implements MethodBeforeAdvice,AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before......");
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("after......");
    }
}
