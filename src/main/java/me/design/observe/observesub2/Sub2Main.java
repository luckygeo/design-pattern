package me.design.observe.observesub2;

/**
 * Created on 2017/8/4
 */
public class Sub2Main {
    public static void main(String[] args) {
        HanFeiZi observable = new HanFeiZi();
        observable.addObserver(new LiSi());
        observable.addObserver(new WangSi());
        observable.fun();

    }
}
