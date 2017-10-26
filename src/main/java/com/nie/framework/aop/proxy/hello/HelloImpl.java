package com.nie.framework.aop.proxy.hello;

/**
 * Created by sam on 2017/10/25.
 */
public class HelloImpl implements Hello {
    @Override
    public void say() {
        System.out.println("hello");
    }
}
