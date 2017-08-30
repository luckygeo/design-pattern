package me.design.abstractfactory;



/**
 * Created on 2017/7/31
 */
public abstract class AbsBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("black");
    }

    @Override
    public void talk() {
        System.out.println("听不懂");
    }
}
