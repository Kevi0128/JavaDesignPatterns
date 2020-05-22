package cn.kevi.study.design.create.FactoryMetohd.multi.impl;

import cn.kevi.study.design.create.FactoryMetohd.multi.interface_.Game;

public class NSGame implements Game {

    @Override
    public void play() {
        System.out.println("play NS game");
    }
}
