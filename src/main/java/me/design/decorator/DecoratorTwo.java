package me.design.decorator;

/**
 * Created on 2017/7/25
 *
 */
public class DecoratorTwo extends Decorator {

    public DecoratorTwo(Human human) {
        super(human);
    }

    public DecoratorTwo() {
    }

    @Override
    public void wearClothes() {
        System.out.println("先买衣服");
        super.wearClothes();
    }

    @Override
    public void walkToWhere() {
        System.out.println("(～﹃～)~zZ");
        super.walkToWhere();
    }
}
