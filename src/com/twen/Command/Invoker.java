package com.twen.Command;

/**
 * Created by congye on 6/19/2015.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
