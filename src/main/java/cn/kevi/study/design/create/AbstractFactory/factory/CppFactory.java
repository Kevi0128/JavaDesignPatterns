package cn.kevi.study.design.create.AbstractFactory.factory;

import cn.kevi.study.design.create.AbstractFactory.impl.CppCoder;
import cn.kevi.study.design.create.AbstractFactory.interface_.Buniess;
import cn.kevi.study.design.create.AbstractFactory.interface_.Coder;

public class CppFactory implements Buniess {

    @Override
    public Coder getCoder() {
        return new CppCoder();
    }
}
