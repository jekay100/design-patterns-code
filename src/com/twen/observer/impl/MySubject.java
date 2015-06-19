package com.twen.observer.impl;

/**
 * Created by congye on 6/19/2015.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("Update Self!");
        notifyObservers();
    }
}
