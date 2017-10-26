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
        //throw new RuntimeException("error");
    }

    public void goodMorning(String name) {
        System.out.println("Good morning : " + name);
    }
    public void goodNight(String name) {
        System.out.printf("Good night : " + name);
    }
}
