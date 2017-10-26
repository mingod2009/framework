package com.nie.framework.aop.proxy.advice;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;

/**
 * Created by sam on 2017/10/26.
 */
@Component
public class GreetingIntroAdvice extends DelegatingIntroductionInterceptor implements Apology {
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        return super.invoke(mi);
    }

    @Override
    public void saySorry(String name) {
        System.out.println("say sorry : " + name);
    }
}
