import com.twen.adapter.*;
import com.twen.builder.Builder;
import com.twen.decorator.*;
import com.twen.decorator.Source;
import com.twen.decorator.Sourceable;
import com.twen.factory.*;
import com.twen.prototype.Prototype;
import com.twen.prototype.SerializableObject;

public class Main {

    public static void main(String[] args) {

        //--------------1.Factory Method
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

        //---------------2.Abstract Factory
        //抽象工厂模式
        //new SenderMailFactory().produce().send();
        //new SenderSmsFactory().produce().send();

        //---------------3.Singleton
        //单例设计模式

        //---------------4.Builder
        //建造者模式
        //Builder builder = new Builder();
        //builder.produceMailSender(10);
        //builder.sendAllMessage();

        //--------------5.Prototype
        //原型设计模式
        /*Prototype prototype = new Prototype();
        prototype.setString("this is prototypeString...");
        prototype.setObj(new SerializableObject());
        Prototype prototypeClone = null;
        try {
            prototypeClone = (Prototype)prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(prototypeClone.getString());*/

        //--------------6.Adapter
        //类的适配器模式
        /*Targetable target = new Adapter();
        target.method1();
        target.method2();*/
        //对象的适配器模式
        /*Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();*/
        //接口的适配器模式
        /*Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();*/

        //--------------7.Decorator
        //装饰器模式
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();

    }
}
