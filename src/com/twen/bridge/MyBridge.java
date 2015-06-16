package com.twen.bridge;

/**
 * Created by congye on 6/16/2015.
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
