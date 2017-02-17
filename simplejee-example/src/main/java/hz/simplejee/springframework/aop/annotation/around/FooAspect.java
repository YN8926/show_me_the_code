package hz.simplejee.springframework.aop.annotation.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by wanghui on 17/02/2017.
 */
@Component
@Aspect
public class FooAspect {

    @Pointcut("execution(* hz.simplejee.springframework.aop.annotation.around.Foo.sayHello(..))")
    public void pointcut() {

    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before>>>>>>>>>>>>");
        joinPoint.proceed();
        System.out.println("after<<<<<<<<<<<<<<<");
    }
}
