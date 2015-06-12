import com.twen.factory.*;

public class Main {

    public static void main(String[] args) {

        //1.Factory Method
        //普通工厂模式
        /*new SenderFactory().produce("sms").send();
        new SenderFactory().produce("mail").send();
        Sender isnullSender = new SenderFactory().produce("twen");
        if(isnullSender != null){
            isnullSender.send();
        }else {
            System.out.println("the Sender is null...");
        }*/

        //多个工厂方法模式
        /*new SenderFactory2().produceSms().send();
        new SenderFactory2().produceMail().send();*/

        //静态工厂方法模式
        //SenderFactory3.produceSmsSender().send();
        //SenderFactory3.pruduceMailSender().send();

        //2.Abstract Factory
        //抽象工厂模式
        new SenderMailFactory().produce().send();
        new SenderSmsFactory().produce().send();

    }
}
