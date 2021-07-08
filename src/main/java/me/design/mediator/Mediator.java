package me.design.mediator;

/**
 * @author: i
 * @createDate: 2021/7/8
 * @version: 1.0
 */
public abstract class Mediator {
    abstract void register(Colleague colleague);

    abstract void relay(Colleague colleague);
}
