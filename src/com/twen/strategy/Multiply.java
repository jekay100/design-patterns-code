package com.twen.strategy;

/**
 * Created by congye on 6/16/2015.
 */
public class Multiply extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] arrayInt = split(exp, "\\*");
        return arrayInt[0]*arrayInt[1];
    }
}
