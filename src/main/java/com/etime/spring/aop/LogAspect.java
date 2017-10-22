package com.etime.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.etime.spring.aop.Action)")
    public void annotationPointCut(){}

    @Pointcut("execution(* com.etime.spring.aop.MethodService.*(..))")
    public void methodPointCut(){}

    @After("annotationPointCut()")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解方式拦截 " + action.name());
    }

    @Before("methodPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法方式拦截 " + method.getName());
    }
}
