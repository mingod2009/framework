package com.nie.framework.aop.proxy.myaop;

import java.lang.annotation.*;

/**
 * Created by sam on 2017/10/26.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAspect {
    Class<? extends Annotation> value();
}
