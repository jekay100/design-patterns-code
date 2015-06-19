package com.twen.iterator.impl;

import com.twen.iterator.Collection;
import com.twen.iterator.Iterator;

/**
 * Created by congye on 6/19/2015.
 */
public class MyCollection implements Collection {

    public String string[] = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
