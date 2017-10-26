package com.nie.framework.aop.proxy.greet;

import org.springframework.stereotype.Component;

/**
 * Created by sam on 2017/10/25.
 */
@Component
public interface Greeting {
    public void sayHello(String name);
}
