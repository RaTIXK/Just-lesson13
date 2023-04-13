package com.project13_observer;

import com.project13_observer.collection.ObserverLinkedList;
import com.project13_observer.collection.ObserverNode;

public abstract class Subject {

    private ObserverLinkedList observers = new ObserverLinkedList();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notify(Object... args) {
        ObserverLinkedList.Iterator iterator = observers.new Iterator();
        while (iterator.hasNext()) {
            final ObserverNode observerNode = iterator.next();
            observerNode.getValue().update(args);
        }
    }

}
