package com.twen.singleton;

/**
 * Created by congye on 6/15/2015.
 */
public class Singleton {

    //持有私有静态实例，防止被引用，此处赋值为null，实现延迟加载
    //private static Singleton ourInstance = null;

    //静态工程方法，创建实例
    /*public static Singleton getInstance() {
        if(ourInstance == null){
            synchronized (ourInstance) {
                if (ourInstance == null) {
                    ourInstance = new Singleton();
                }
            }
        }
        return ourInstance;
    }*/

    //此处使用一个内部类来维护单例
    private static class SingletonFactory{
        private static Singleton ourInstance = new Singleton();
    }

    //获取实例
    public static Singleton getInstance(){
        return SingletonFactory.ourInstance;
    }

    //私有化构造方法，防止被实例化
    private Singleton() {
    }

    //如果该对象被用于序列化，可以保证在序列化前后保持一致
    public Object readResolve(){
//        return ourInstance;
        return getInstance();
    }
}
