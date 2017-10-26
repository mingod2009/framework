package com.nie.framework.aop.proxy.greet;

/**
 * Created by sam on 2017/10/25.
 */
public class GreetingProxy implements Greeting{
    private Greeting greet;
    public GreetingProxy(Greeting greet) {
        this.greet = greet;
    }
    @Override
    public void sayHello(String name) {
        before();
        greet.sayHello(name);
        after();
    }
    public void before() {
        System.out.println("before greeting");
    }
    public void after() {
        System.out.println("after greeting");
    }
}
