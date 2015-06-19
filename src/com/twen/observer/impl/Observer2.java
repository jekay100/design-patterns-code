package com.twen.observer.impl;

import com.twen.observer.Observer;

/**
 * Created by congye on 6/19/2015.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer2 has received!");
    }
}
