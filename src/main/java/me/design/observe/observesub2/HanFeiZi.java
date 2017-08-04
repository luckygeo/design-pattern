package me.design.observe.observesub2;

import me.design.observe.IHanFeiZi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017/8/4
 */
public class HanFeiZi implements IHanFeiZi, Observable{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String context) {
        for (Observer observer : observers) {
            observer.update(this,context);
        }
    }

    @Override
    public void haveBreakFast() {
        System.out.println("韩非子吃饭");
        this.notifyObserver("韩非子在吃饭");
    }

    @Override
    public void fun() {
        System.out.println("韩非子娱乐");
        this.notifyObserver("韩非子在娱乐");
    }
}
