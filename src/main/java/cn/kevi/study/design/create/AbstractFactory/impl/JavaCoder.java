package cn.kevi.study.design.create.AbstractFactory.impl;

import cn.kevi.study.design.create.AbstractFactory.interface_.Coder;

public class JavaCoder implements Coder {

    @Override
    public void code() {
        System.out.println("Java coder working");
    }
}
