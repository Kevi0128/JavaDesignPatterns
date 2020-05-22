package cn.kevi.study.design.create.AbstractFactory.factory;

import cn.kevi.study.design.create.AbstractFactory.impl.JavaCoder;
import cn.kevi.study.design.create.AbstractFactory.interface_.Buniess;
import cn.kevi.study.design.create.AbstractFactory.interface_.Coder;

public class JavaFactory implements Buniess {

    @Override
    public Coder getCoder() {
        return new JavaCoder();
    }
}
