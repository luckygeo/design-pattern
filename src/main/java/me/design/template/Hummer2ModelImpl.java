package me.design.template;

/**
 * Created on 2017/8/1
 */
public class Hummer2ModelImpl extends HummerModel {
    @Override
    public void start() {
        System.out.println("2启动");
    }

    @Override
    public void stop() {
        System.out.println("2停止");
    }

    @Override
    public void alarm() {
        System.out.println("2鸣笛");
    }



}
