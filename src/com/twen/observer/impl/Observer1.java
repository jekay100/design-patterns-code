package com.twen.observer.impl;

import com.twen.observer.Observer;

/**
 * Created by congye on 6/19/2015.
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer1 has received!");
    }
}
