package com.twen.factory;

import com.twen.factory.impl.MailSender;

/**
 * Created by congye on 6/12/2015.
 */
public class SenderMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
