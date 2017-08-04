package me.design.factory;

import me.design.strategy.sub3.Calc;

/**
 * Created on 2017/7/31
 */
public class StaticHumanFactory {
    private final static AbstractHumanFactory factory = new AbstractHumanFactoryImpl();

    public static Human crtHuman(Class cl){
        return factory.creatHuman(cl);
    }

}
