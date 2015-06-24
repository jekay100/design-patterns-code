package com.twen.mediator;

/**
 * Created by congye on 6/24/2015.
 */
public class User2 extends User {

    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }

}
