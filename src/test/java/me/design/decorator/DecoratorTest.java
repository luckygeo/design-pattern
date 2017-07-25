package me.design.decorator;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created on 2017/7/25
 */
public class DecoratorTest extends TestCase {

    @Test
    public void testWearClothes() throws Exception {
        Person person = new Person();//基本类
        //每装饰一次功能增多一次
        Human human1 = new DecoratorOne(person);
        human1.walkToWhere();
        Human human2 = new DecoratorTwo(new Person());
        human2.walkToWhere();
        human2.wearClothes();
        Human human3 = new DecoratorOne(new DecoratorTwo(person));
        human3.wearClothes();
        human3.walkToWhere();
    }
    @Test
    public void testWalkToWhere() throws Exception {
    }

}