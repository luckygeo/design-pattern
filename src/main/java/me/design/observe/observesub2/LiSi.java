package me.design.observe.observesub2;

import me.design.observe.sub1.ILiSi;

import java.util.Observable;

/**
 * Created on 2017/8/3
 */
public class LiSi implements Observer {
    @Override
    public void update(me.design.observe.observesub2.Observable observable , Object obj) {
        System.out.println("lisi观察到李斯的活动：报告");
        this.report2QinShiHuang(obj.toString());
        System.out.println("报告完毕");
    }

    private void report2QinShiHuang(String context) {
        System.out.println("报告：韩非子有活动了： " + context);
    }
}
