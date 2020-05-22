package cn.kevi.study.design.create.FactoryMetohd.normal.factory;

import cn.kevi.study.design.create.FactoryMetohd.normal.impl.EmailSender;
import cn.kevi.study.design.create.FactoryMetohd.normal.impl.SMSSender;
import cn.kevi.study.design.create.FactoryMetohd.normal.interface_.Sender;

public class SendFactory {

    public static final int Email = 1;
    public static final int SMS = 2;

    public Sender getSender(int type){
        switch (type){
            case Email:
                return new EmailSender();
            case SMS:
                return new SMSSender();
            default:
                System.out.println("请输入/选择正确的类型");
                return null;
        }
    }

}
