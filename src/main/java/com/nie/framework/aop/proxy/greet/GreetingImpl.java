package com.nie.framework.aop.proxy.greet;

import org.springframework.stereotype.Component;

/**
 * Created by sam on 2017/10/25.
 */
@Component("greetingImpl")
public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("say: " +name);
    }
}
