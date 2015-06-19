import com.twen.Command.Command;
import com.twen.Command.Invoker;
import com.twen.Command.Receiver;
import com.twen.Command.impl.MyCommand;
import com.twen.adapter.*;
import com.twen.bridge.*;
import com.twen.bridge.SourceSub1;
import com.twen.bridge.SourceSub2;
import com.twen.builder.Builder;
import com.twen.chainofresponsibility.impl.MyHandler;
import com.twen.composite.Tree;
import com.twen.composite.TreeNode;
import com.twen.decorator.*;
import com.twen.decorator.Source;
import com.twen.decorator.Sourceable;
import com.twen.facade.Computer;
import com.twen.factory.*;
import com.twen.iterator.Collection;
import com.twen.iterator.Iterator;
import com.twen.iterator.impl.MyCollection;
import com.twen.memento.Original;
import com.twen.memento.Storage;
import com.twen.observer.Subject;
import com.twen.observer.impl.MySubject;
import com.twen.observer.impl.Observer1;
import com.twen.observer.impl.Observer2;
import com.twen.prototype.Prototype;
import com.twen.prototype.SerializableObject;
import com.twen.proxy.Proxy;
import com.twen.strategy.ICalculator;
import com.twen.strategy.Plus;
import com.twen.template.AbstractCalculator;

import java.util.Enumeration;

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
        /*Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();*/

        //-------------8.Proxy
        //代理模式
        /*com.twen.proxy.Sourceable source = new Proxy();
        source.method();*/

        //--------------9.Facade
        //外观模式
        /*Computer computer = new Computer();
        computer.startup();
        computer.shutdown();*/

        //--------------10.Bridge
        //桥接模式
        /*Bridge bridge = new MyBridge();
        //调用第一个对象
        com.twen.bridge.Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();
        //调用第二个对象
        com.twen.bridge.Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();*/

        //------------11.Composite
        //组合模式
/*        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);

        System.out.println("build the tree finished...");

        System.out.println("root Name:"+tree.root.getName());

//        Enumeration<TreeNode> enumTreeNode = tree.root.getChildren();
//        if (enumTreeNode.hasMoreElements()){
//            TreeNode nextTreeNode = enumTreeNode.nextElement();
//            System.out.println("nextTreeNode Name:"+nextTreeNode.getName());
//            Enumeration<TreeNode> nextEnumTreeNode = nextTreeNode.getChildren();
//            if (nextEnumTreeNode.hasMoreElements()){
//                TreeNode nnextTreeNode = nextEnumTreeNode.nextElement();
//                System.out.println("nnextTreeNode Name:"+nnextTreeNode.getName());
//            }
//        }

        tree.printTreeNodeName(tree.root);*/

        //----------------13.Strategy
        //策略模式
        /*String exp = "2+5";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);*/

        //----------------14.Template Method
        //模板方法
        /*String exp = "8+8";
        AbstractCalculator cal = new com.twen.template.Plus();
        int result = cal.calculator(exp, "\\+");
        System.out.println(result);*/

        //-------------15.Observer
        //观察者模式
        /*Subject sub =new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();*/

        //-------------16.Iterator
        //迭代子模式
        /*Collection collection = new MyCollection();
        Iterator it = collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/

        //-------------17.Chain of Responsibility
        //责任链模式
        /*MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");
        h1.setHandler(h2);
        h2.setHandler(h3);
        h1.operator();*/

        //-------------18.Command
        //命令模式
        /*Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();*/

        //--------------19.Memento
        //备忘录模式

        // 创建原始类
        Original origi = new Original("egg");
        // 创建备忘录
        Storage storage = new Storage(origi.createMemento());
        // 修改原始类的状态
        System.out.println("初始化状态为：" + origi.getValue());
        origi.setValue("niu");
        System.out.println("修改后的状态为：" + origi.getValue());
        // 回复原始类的状态
        origi.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + origi.getValue());


    }

}
