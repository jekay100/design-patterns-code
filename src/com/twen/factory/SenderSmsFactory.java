package com.twen.factory;

import com.twen.factory.impl.SmsSender;

/**
 * Created by congye on 6/12/2015.
 */
public class SenderSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
