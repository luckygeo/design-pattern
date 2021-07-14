package me.design.flyweight;

/**
 * @author: i
 * @createDate: 2021/7/14
 * @version: 1.0
 */
public class ConcreteFlyweight extends Flyweight {
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("具体Flyweight:" + extrinsic);
    }
}
