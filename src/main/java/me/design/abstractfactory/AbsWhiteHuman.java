package me.design.abstractfactory;

/**
 * Created on 2017/7/31
 */
public abstract class AbsWhiteHuman implements Human {


    @Override
    public void getColor() {
        System.out.println("white");
    }

    @Override
    public void talk() {
        System.out.println("单字节");
    }
}
