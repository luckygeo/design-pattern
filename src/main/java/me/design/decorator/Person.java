package me.design.decorator;

/**
 * Created on 2017/7/25
 *
 * 初始化被装饰者状态
 * 基本功能只有  穿衣服和散步
 * 被装饰以后可以拥有装饰类的功能，如需扩展，只需要增加装饰类即可
 *
 * @see me.design.decorator.DecoratorTest
 */
public class Person implements Human {
    @Override
    public void wearClothes() {
        System.out.println("我穿衣服");
    }

    @Override
    public void walkToWhere() {
        System.out.println("我散步");
    }
}
