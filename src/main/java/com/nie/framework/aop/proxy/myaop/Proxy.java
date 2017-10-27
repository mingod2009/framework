package com.nie.framework.aop.proxy.myaop;

/**
 * Created by sam on 2017/10/26.
 */
public interface Proxy {

    Object doProxy(ProxyChain proxyChain) throws Throwable;

}
