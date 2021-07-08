package me.design.mediator;

/**
 * @author: i
 * @createDate: 2021/7/8
 * @version: 1.0
 */
public class ColleagueImpl1 extends Colleague {

    @Override
    void send() {
        System.out.println("send");
        getMediator().relay(this);
    }

    @Override
    void receive() {
        System.out.println("get");
    }
}
