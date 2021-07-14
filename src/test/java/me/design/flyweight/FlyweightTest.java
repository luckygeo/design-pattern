package me.design.flyweight;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author: i
 * @createDate: 2021/7/14
 * @version: 1.0
 */
public class FlyweightTest {
    @Test
    public void test() {
        int extrinsic = 22;
        Flyweight flyweight = FlyweightFactory.getFlyweight("aaa");
        flyweight.operate(++extrinsic);
        System.out.println(flyweight.getIntrinsic());
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("aaa");
        flyweight2.operate(++extrinsic);
        Assert.assertEquals(flyweight, flyweight2);
    }
}
