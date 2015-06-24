package com.twen.visitor.impl;

import com.twen.visitor.Subject;
import com.twen.visitor.Visitor;

/**
 * Created by congye on 6/23/2015.
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
