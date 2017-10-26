package com.nie.framework.aop.proxy.hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by sam on 2017/10/25.
 */
public class DynamicProxy implements InvocationHandler {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }
    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }
    private void before() {
        System.out.println("before");
    }
    private void after() {
        System.out.println("after");
    }
}
