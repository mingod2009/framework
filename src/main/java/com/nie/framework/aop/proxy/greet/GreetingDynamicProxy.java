package com.nie.framework.aop.proxy.greet;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by sam on 2017/10/25.
 */
public class GreetingDynamicProxy implements InvocationHandler {
    private Object target;

    public GreetingDynamicProxy(Object target) {
        this.target = target;
    }
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }
    public void before() {
        System.out.println("dynamic before : ");
    }
    public void after() {
        System.out.println("dynamic after : ");
    }
}
