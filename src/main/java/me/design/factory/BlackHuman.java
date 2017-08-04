package me.design.factory;

/**
 * Created on 2017/7/31
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("black");
    }

    @Override
    public void talk() {
        System.out.println("听不懂");
    }
}
