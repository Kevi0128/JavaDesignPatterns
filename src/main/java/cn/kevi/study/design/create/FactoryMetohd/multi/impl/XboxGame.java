package cn.kevi.study.design.create.FactoryMetohd.multi.impl;

import cn.kevi.study.design.create.FactoryMetohd.multi.interface_.Game;

public class XboxGame implements Game {

    @Override
    public void play() {
        System.out.println("play Xbox game");
    }
}
