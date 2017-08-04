package me.design.observe.sub1;

import me.design.observe.IHanFeiZi;

/**
 * Created on 2017/8/3
 */
public class IHanFeiZiImpl implements IHanFeiZi {

    public boolean isHavingBreakFast() {
        return isHavingBreakFast;
    }

    public void setHavingBreakFast(boolean havingBreakFast) {
        isHavingBreakFast = havingBreakFast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }

    private boolean isHavingBreakFast = false;

    private boolean isHavingFun       = false;


    @Override
    public void haveBreakFast() {
        System.out.println("韩非子： 开始吃饭了。。。");
        this.isHavingBreakFast = true;
    }

    @Override
    public void fun() {
        System.out.println("韩非子： 开始娱乐了。。。");
        this.isHavingFun = true;
    }
}
