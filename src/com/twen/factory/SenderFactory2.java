package com.twen.factory;

import com.twen.factory.impl.MailSender;
import com.twen.factory.impl.SmsSender;

/**
 * Created by congye on 6/12/2015.
 */
public class SenderFactory2 {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
