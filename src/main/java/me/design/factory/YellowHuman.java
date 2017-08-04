package me.design.factory;

/**
 * Created on 2017/7/31
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("yellow");
    }

    @Override
    public void talk() {
        System.out.println("黄种人双字节");
    }
}
