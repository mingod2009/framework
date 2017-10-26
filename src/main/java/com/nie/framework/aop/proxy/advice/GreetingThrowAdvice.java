package com.nie.framework.aop.proxy.advice;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by sam on 2017/10/26.
 */
@Component
public class GreetingThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
        System.out.println("---------throw exception -------------");
        System.out.println("---------target class----------" + target.getClass().getName());
        System.out.println("---------Method Name: " + method.getName());
        System.out.println("---------error message: " + e.getMessage());
    }

}
