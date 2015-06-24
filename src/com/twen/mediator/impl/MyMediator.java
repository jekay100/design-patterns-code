package com.twen.mediator.impl;

import com.twen.mediator.Mediator;
import com.twen.mediator.User;
import com.twen.mediator.User1;
import com.twen.mediator.User2;

/**
 * Created by congye on 6/24/2015.
 */
public class MyMediator implements Mediator {

    private User user1;
    private User user2;

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    @Override
    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
