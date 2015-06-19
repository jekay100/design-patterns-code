package com.twen.observer.impl;

import com.twen.observer.Observer;
import com.twen.observer.Subject;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by congye on 6/19/2015.
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumO = vector.elements();
        while (enumO.hasMoreElements()){
            enumO.nextElement().update();
        }
    }

}
