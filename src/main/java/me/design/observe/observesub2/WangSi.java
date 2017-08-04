package me.design.observe.observesub2;

/**
 * Created on 2017/8/4
 */
public class WangSi implements Observer {
    @Override
    public void update(Observable observable, Object obj) {
        System.out.println("wangsi观察到李斯的活动：报告");

        System.out.println("报告完毕");
    }
}
