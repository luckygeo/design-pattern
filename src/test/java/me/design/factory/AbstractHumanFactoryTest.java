package me.design.factory;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created on 2017/7/31
 */
public class AbstractHumanFactoryTest {
    @Test
    public void testCreatHuman() throws Exception {
        AbstractHumanFactory factory = new AbstractHumanFactoryImpl();
        Human human = factory.creatHuman(BlackHuman.class);
        Human human2 = factory.creatHuman(YellowHuman.class);
        human.getColor();
        human.talk();

        human2.getColor();
        human2.talk();
    }
    @Test
    public void testStaticFactory(){
        Human human = StaticHumanFactory.crtHuman(WhiteHuman.class);
        human.getColor();
        human.talk();
    }

}