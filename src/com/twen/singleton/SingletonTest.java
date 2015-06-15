package com.twen.singleton;

import java.util.Vector;

/**
 * Created by congye on 6/15/2015.
 */
public class SingletonTest {
    private static SingletonTest ourInstance = null;
    //补充：采用“影子实例”的方法为单例对象的属性同步更新
    private Vector properties = null;

    public Vector getProperties(){
        return properties;
    }

    public void updateProperties(){
        SingletonTest shadow = new SingletonTest();
        properties = shadow.getProperties();
    }

    private static synchronized void syncInit(){
        if (ourInstance == null){
            ourInstance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance() {
        if (ourInstance == null){
            syncInit();
        }
        return ourInstance;
    }

    private SingletonTest() {
    }
}
