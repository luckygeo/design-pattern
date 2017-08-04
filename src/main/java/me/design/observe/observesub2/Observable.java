package me.design.observe.observesub2;


/**
 * Created on 2017/8/4
 */
public interface Observable{
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObserver(String context);
}
