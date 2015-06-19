package com.twen.chainofresponsibility.impl;

import com.twen.chainofresponsibility.AbstractHandler;
import com.twen.chainofresponsibility.Handler;

/**
 * Created by congye on 6/19/2015.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if (getHandler()!=null){
            getHandler().operator();
        }
    }
}
