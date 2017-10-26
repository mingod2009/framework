package com.nie.framework.aop.proxy.greet;

/**
 * Created by sam on 2017/10/25.
 */
public class Main {
    public static void main(String[] args) {
        Greeting greet = new GreetingImpl();
        GreetingProxy proxy = new GreetingProxy(greet);
        proxy.sayHello("proxy");

        System.out.println("========================");

        GreetingDynamicProxy dynamicProxy = new GreetingDynamicProxy(greet);
        Greeting dynamicGreet = dynamicProxy.getProxy();
        dynamicGreet.sayHello("dynamic greet");

        System.out.println("=========================");

        GreetingCglib.getInstance().getProxy(GreetingImpl.class).sayHello("cglib greeting");
    }
}
