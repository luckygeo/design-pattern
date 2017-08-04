package me.design.factory;

/**
 * Created on 2017/7/31
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T creatHuman(Class cl);
}
