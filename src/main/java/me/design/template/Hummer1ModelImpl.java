package me.design.template;

/**
 * Created on 2017/8/1
 */
public class Hummer1ModelImpl extends HummerModel {
    @Override
    public void start() {
        System.out.println("1启动");
    }

    @Override
    public void stop() {
        System.out.println("1停止");
    }

    @Override
    public void alarm() {
        System.out.println("1鸣笛");
    }


}
