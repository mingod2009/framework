package com.nie.framework.aop.proxy.hello;

/**
 * Created by sam on 2017/10/25.
 */
public class HelloProxy implements Hello{

    private Hello hello;
    public HelloProxy(Hello hello) {
        this.hello = hello;
    }
    @Override
    public void say() {
        before();
        hello.say();
        after();
    }
    private void before() {
        System.out.println("start say : ");
    }
    private void after() {
        System.out.println("end say !");
    }
}
