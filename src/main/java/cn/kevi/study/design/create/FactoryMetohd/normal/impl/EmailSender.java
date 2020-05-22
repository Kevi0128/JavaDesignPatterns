package cn.kevi.study.design.create.FactoryMetohd.normal.impl;

import cn.kevi.study.design.create.FactoryMetohd.normal.interface_.Sender;

public class EmailSender implements Sender {

    public void send() {
        System.out.println("Email send");
    }
}
