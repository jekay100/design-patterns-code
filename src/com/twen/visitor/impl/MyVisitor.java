package com.twen.visitor.impl;

import com.twen.visitor.Subject;
import com.twen.visitor.Visitor;

/**
 * Created by congye on 6/23/2015.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject: "+sub.getSubject());
    }
}
