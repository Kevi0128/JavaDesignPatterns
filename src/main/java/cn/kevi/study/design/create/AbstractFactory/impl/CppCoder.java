package cn.kevi.study.design.create.AbstractFactory.impl;

import cn.kevi.study.design.create.AbstractFactory.interface_.Coder;

public class CppCoder implements Coder {

    @Override
    public void code() {
        System.out.println("C++ coder working");
    }
}
