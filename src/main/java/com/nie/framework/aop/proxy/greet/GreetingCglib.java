package com.nie.framework.aop.proxy.greet;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by sam on 2017/10/25.
 */
public class GreetingCglib implements MethodInterceptor {

    private static GreetingCglib instance = new GreetingCglib();

    public static GreetingCglib getInstance() {
        return instance;
    }
    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }
    public void before() {
        System.out.println("cglib before");
    }
    public void after() {
        System.out.println("cglib after");
    }
}
