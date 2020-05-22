package cn.kevi.study.design.create.AbstractFactory;

import cn.kevi.study.design.create.AbstractFactory.factory.JavaFactory;
import cn.kevi.study.design.create.AbstractFactory.interface_.Coder;

public class AbstractFactoryTest {

    public static void main(String[] args){
        JavaFactory javaFactory = new JavaFactory();
        Coder coder = javaFactory.getCoder();
        coder.code();
    }

}
