package me.design.abstractfactory;

/**
 * Created on 2017/8/1
 */
public class FemaleHumanFactoryImpl implements HumanFactory {
    @Override
    public Human crtBalckHuman() {
        return new FemaleBlackHumanImpl();
    }

    @Override
    public Human crtWhiteHuman() {
        return new FemaleWhiteHumanImpl();
    }
}
