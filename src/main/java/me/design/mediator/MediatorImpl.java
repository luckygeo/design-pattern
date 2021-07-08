package me.design.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: i
 * @createDate: 2021/7/8
 * @version: 1.0
 */
public class MediatorImpl extends Mediator {

    final List<Colleague> list;

    public MediatorImpl() {
        list = new ArrayList<>();
    }

    @Override
    void register(Colleague colleague) {
        if (!list.contains(list)) {
            colleague.setMediator(this);
            list.add(colleague);
        }
    }

    @Override
    void relay(Colleague colleague) {
        list.forEach(c -> {
            if (!c.equals(colleague)) {
                c.receive();
            }
        });
    }
}
