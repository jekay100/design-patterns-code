package com.twen.factory.impl;

import com.twen.factory.Sender;

/**
 * Created by congye on 6/12/2015.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailSender...");
    }
}
