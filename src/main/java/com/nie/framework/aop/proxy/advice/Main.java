package com.nie.framework.aop.proxy.advice;


import com.nie.framework.aop.proxy.greet.Greeting;
import com.nie.framework.aop.proxy.greet.GreetingImpl;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sam on 2017/10/25.
 */
public class Main {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingBeforeAdvice());
        proxyFactory.addAdvice(new GreetingAfterAdvice());

        Greeting greeting = (Greeting) proxyFactory.getProxy();

        greeting.sayHello("aop Advice");

        System.out.println("================================");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Greeting greetingAop =(Greeting) context.getBean("greetingProxy");
        greeting.sayHello("spring aop");

    }
}
