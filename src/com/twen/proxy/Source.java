package com.twen.proxy;

/**
 * Created by congye on 6/15/2015.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
