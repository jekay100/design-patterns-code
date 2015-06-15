package com.twen.proxy;

/**
 * Created by congye on 6/15/2015.
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        this.source = new Source();
    }

    private void after(){
        System.out.println("after proxy!");
    }

    private void before(){
        System.out.println("before proxy!");
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }
}
