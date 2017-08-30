package me.design.abstractfactory;

/**
 * Created on 2017/8/1
 * 测试抽象工厂
 */
public class NvWa {

    public static void main(String[] args) {
        HumanFactory humanFactory = new MaleHumanFactoryImpl();
        Human human = humanFactory.crtBalckHuman();
        human.getColor();
        human.getSex();
        human.talk();
        human = new FemaleHumanFactoryImpl().crtWhiteHuman();
        human.getColor();
        human.getSex();
        human.talk();


        //black
        //我是男人
        //听不懂
        //white
        //我是女人
        //单字节
    }

}
