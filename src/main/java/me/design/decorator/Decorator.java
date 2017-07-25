package me.design.decorator;

/**
 * Created on 2017/7/25
 * 定义装饰者
 */
public class Decorator implements Human {

    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    public Decorator() {
    }


    @Override
    public void wearClothes() {
        this.human.wearClothes();
    }

    @Override
    public void walkToWhere() {
        this.human.walkToWhere();
    }
}
