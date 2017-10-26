package com.nie.framework.aop.proxy.hello;

/**
 * Created by sam on 2017/10/25.
 */
public class Main {
    public static void main(String[] args) {

        Hello hello = new HelloImpl();
        Hello proxyHello = new HelloProxy(hello);
        proxyHello.say();

        System.out.println("=====================");

        DynamicProxy dynamicProxy = new DynamicProxy(hello);
        Hello helloProxyD = dynamicProxy.getProxy();

        helloProxyD.say();

        System.out.println("==========cglib============");
        Hello cglibHello = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        cglibHello.say();
    }
}
