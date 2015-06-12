package com.twen.factory;

import com.twen.factory.impl.MailSender;
import com.twen.factory.impl.SmsSender;

/**
 * Created by congye on 6/12/2015.
 */
public class SenderFactory {
    public Sender produce(String type){
        if(type != null && type.equals("sms")){
            return new SmsSender();
        }else if (type != null && type.equals("mail")){
            return new MailSender();
        }else {
            System.out.println("the type is incorrect...");
            return null;
        }
    }
}
