package hz.simplejee.springframework.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by 辉辉大侠 on 29/10/2016.
 */
@Aspect//声明一个切面
@Component//让切面成为受Spring容器管理的Bean
public class LogAspect {

    /**
     * 注解声明一个切点
     */
    @Pointcut("@annotation(hz.simplejee.springframework.aop.annotation.MyAnnotation)")
    public void annotationPointCut() {
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
        System.out.println("注解式拦截>>" + myAnnotation.name());
    }

    @Before("execution(*hz.simplejee.springframework.aop.annotation.MyService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法拦截器>>" + method.getName());
    }

}
