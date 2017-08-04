package me.design.observe.sub1;

/**
 * Created on 2017/8/3
 */
public class ILiSiImpl implements ILiSi {
    @Override
    public void update(String context) {
        System.out.println("观察到李斯的活动：报告");
        this.report2QinShiHuang(context);
        System.out.println("报告完毕");
    }

    private void report2QinShiHuang(String context) {
        System.out.println("报告：韩非子有活动了： " + context);
    }
}
