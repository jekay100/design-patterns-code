package com.twen.adapter;

/**
 * Created by congye on 6/15/2015.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
