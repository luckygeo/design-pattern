package me.design.abstractfactory;

/**
 * Created on 2017/8/1
 */
public class MaleHumanFactoryImpl implements HumanFactory {
    @Override
    public Human crtBalckHuman() {
        return new MaleBlackHumanImpl();
    }

    @Override
    public Human crtWhiteHuman() {
        return new MaleWhiteHumanImpl();
    }
}
