package cn.kevi.study.design.create.FactoryMetohd.normal;

import cn.kevi.study.design.create.FactoryMetohd.normal.factory.SendFactory;
import cn.kevi.study.design.create.FactoryMetohd.normal.interface_.Sender;

//普通工厂模式演示
public class NormalFactoryTest {

    public static void main(String[] args){
        SendFactory factory = new SendFactory();
        Sender sender = factory.getSender(SendFactory.Email);
        sender.send();
    }

}
