import com.twen.factory.*;

public class Main {

    public static void main(String[] args) {

        //1.Factory Method
        //??????
        /*new SenderFactory().produce("sms").send();
        new SenderFactory().produce("mail").send();
        Sender isnullSender = new SenderFactory().produce("twen");
        if(isnullSender != null){
            isnullSender.send();
        }else {
            System.out.println("the Sender is null...");
        }*/

        //????????
        /*new SenderFactory2().produceSms().send();
        new SenderFactory2().produceMail().send();*/

        //????????
        //SenderFactory3.produceSmsSender().send();
        //SenderFactory3.pruduceMailSender().send();

        //2.Abstract Factory
        //??????
        new SenderMailFactory().produce().send();
        new SenderSmsFactory().produce().send();

    }
}
