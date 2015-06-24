package com.twen.visitor;

/**
 * Created by congye on 6/23/2015.
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
