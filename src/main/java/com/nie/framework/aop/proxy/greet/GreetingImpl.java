package com.nie.framework.aop.proxy.greet;

import com.nie.framework.aop.proxy.aspectj.Tag;
import org.springframework.stereotype.Component;

/**
 * Created by sam on 2017/10/25.
 */
@Component("greetingImpl")
public class GreetingImpl implements Greeting {
    @Tag
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
