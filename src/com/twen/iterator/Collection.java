package com.twen.iterator;


/**
 * Created by congye on 6/19/2015.
 */
public interface Collection {

    public Iterator iterator();

    //取得集合元素
    public Object get(int i);

    //取得集合大小
    public int size();

}
