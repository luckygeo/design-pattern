package me.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: i
 * @createDate: 2021/7/8
 * @version: 1.0
 */
public class OrderInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        proxy = (OrderService) () -> System.out.println(1);
        Class<?> declaringClass = method.getDeclaringClass();
        System.out.println(declaringClass.getName());
        return null;
    }
}
