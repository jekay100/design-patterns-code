package com.twen.chainofresponsibility;

/**
 * Created by congye on 6/19/2015.
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
