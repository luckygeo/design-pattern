package me.design.proxy;

import java.lang.reflect.Proxy;

/**
 * @author: i
 * @createDate: 2021/7/8
 * @version: 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        OrderService os = (OrderService) Proxy.newProxyInstance(OrderService.class.getClassLoader(), new Class[]{OrderService.class}, new OrderInvocationHandler());
        os.order();
        System.out.println("end");
    }
}
