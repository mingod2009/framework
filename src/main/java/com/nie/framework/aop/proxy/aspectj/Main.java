package com.nie.framework.aop.proxy.aspectj;


import com.nie.framework.aop.proxy.greet.Greeting;
import com.nie.framework.aop.proxy.greet.GreetingImpl;

/**
 * Created by sam on 2017/10/25.
 */
public class Main {
    public static void main(String[] args) {
        Greeting greetImpl = new GreetingImpl();
        greetImpl.sayHello("a");
    }
}
