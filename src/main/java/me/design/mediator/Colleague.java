package me.design.mediator;

/**
 * @author: i
 * @createDate: 2021/7/8
 * @version: 1.0
 */
public abstract class Colleague {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void send();

    abstract void receive();
}
