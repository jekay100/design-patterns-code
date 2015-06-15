package com.twen.adapter;

/**
 * Created by congye on 6/15/2015.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method2() {
        source.method1();
    }
}
