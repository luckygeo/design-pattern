package me.design.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @author: i
 * @createDate: 2021/7/8
 * @version: 1.0
 */
public class ProxyTest {
    @Test
    public void proxy(){
        OrderService os = (OrderService) Proxy.newProxyInstance(OrderService.class.getClassLoader(), new Class[]{OrderService.class}, new OrderInvocationHandler());
        os.order();
    }
}
