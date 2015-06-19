package com.twen.Command.impl;

import com.twen.Command.Command;
import com.twen.Command.Receiver;

/**
 * Created by congye on 6/19/2015.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
