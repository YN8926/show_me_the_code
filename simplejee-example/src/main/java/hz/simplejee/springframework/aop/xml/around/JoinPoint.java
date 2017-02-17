package hz.simplejee.springframework.aop.xml.around;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by wanghui on 17/02/2017.
 */
public class JoinPoint {

    public void process(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("============before");
        joinPoint.proceed();
        System.out.println("=============after");
    }
}
