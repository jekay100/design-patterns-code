package com.twen.builder;

import com.twen.factory.Sender;
import com.twen.factory.impl.MailSender;
import com.twen.factory.impl.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by congye on 6/15/2015.
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }

    public void sendAllMessage() {
        for (Sender sender : list){
            sender.send();
        }
    }
}
