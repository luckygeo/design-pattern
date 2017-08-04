package me.design.factory;

/**
 * Created on 2017/7/31
 */
public class WhiteHuman implements Human {

    private WhiteHuman(){}


    @Override
    public void getColor() {
        System.out.println("white");
    }

    @Override
    public void talk() {
        System.out.println("单字节");
    }
}
