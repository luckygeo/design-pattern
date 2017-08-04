package me.design.factory;

import java.lang.reflect.InvocationTargetException;

/**
 * Created on 2017/7/31
 */
public class AbstractHumanFactoryImpl extends AbstractHumanFactory {
    @Override
    public <T extends Human> T creatHuman(Class cl) {
        T human = null;
        try {
            human = (T)cl.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human;
    }
}
