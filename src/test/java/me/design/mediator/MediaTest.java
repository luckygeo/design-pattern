package me.design.mediator;

import org.junit.Test;

/**
 * @author: i
 * @createDate: 2021/7/8
 * @version: 1.0
 */
public class MediaTest {
    @Test
    public void test(){
        Mediator mediator = new MediatorImpl();
        Colleague colleagueImpl1 = new ColleagueImpl1();
        Colleague colleagueImpl2 = new ColleagueImpl1();
        Colleague colleagueImpl3 = new ColleagueImpl1();
        mediator.register(colleagueImpl1);
        mediator.register(colleagueImpl2);
        mediator.register(colleagueImpl3);
        colleagueImpl1.setMediator(mediator);

        colleagueImpl1.send();
    }
}
