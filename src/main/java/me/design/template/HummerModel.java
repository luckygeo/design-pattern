package me.design.template;

/**
 * Created on 2017/8/1
 */
public abstract class HummerModel {

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    final void run(){
        this.alarm();
        this.start();
        this.stop();
    };

}
