package com.twen.template;

/**
 * Created by congye on 6/19/2015.
 */
public abstract class AbstractCalculator {

    //主方法，实现对本类其他方法的调用
    public final int calculator(String exp, String opt){
        int[] array = split(exp, opt);
        return calculator(array[0], array[1]);
    }

    //被子类重写的方法
    abstract public int calculator(int num1, int num2);

    public int[] split(String exp, String opt){
        String[] array = exp.split(opt);
        int[] arrayInt = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }

}
