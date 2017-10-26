package com.nie.framework.aop.proxy.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by sam on 2017/10/26.
 */
@Aspect
@Component
public class GreetingAspect {
    //@Around("execution(* com.nie.framework.aop.proxy.greet.GreetingImpl.*(..))")
    @Around("@annotation(com.nie.framework.aop.proxy.aspectj.Tag)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        before();
        Object result = pjp.proceed();
        after();
        return result;
    }
    private void before() {
        System.out.printf("aspectj before");
    }
    private void after() {
        System.out.printf("aspectj after");
    }
}
