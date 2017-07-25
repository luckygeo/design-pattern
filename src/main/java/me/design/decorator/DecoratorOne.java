package me.design.decorator;

/**
 * Created on 2017/7/25
 * 装饰者之一
 */
public class DecoratorOne extends Decorator{
    public DecoratorOne(Human human) {
        super(human);
    }

    public DecoratorOne() {
    }

    public void getUp(){
        System.out.println("起床");
    }

    @Override
    public void wearClothes() {
        this.getUp();
        super.wearClothes();
    }

    @Override
    public void walkToWhere() {
        System.out.println("先吃饭");
        super.walkToWhere();
    }
}
