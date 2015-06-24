package com.twen.interpreter.impl;

import com.twen.interpreter.Context;
import com.twen.interpreter.Expression;

/**
 * Created by congye on 6/24/2015.
 */
public class Plus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
