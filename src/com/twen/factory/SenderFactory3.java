package com.twen.factory;

import com.twen.factory.impl.MailSender;
import com.twen.factory.impl.SmsSender;

/**
 * Created by congye on 6/12/2015.
 */
public class SenderFactory3 {

    public static Sender pruduceMailSender(){
        return new MailSender();
    }

    public static Sender produceSmsSender(){
        return new SmsSender();
    }

}
