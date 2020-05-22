package cn.kevi.study.design.create.FactoryMetohd.multi.impl;

import cn.kevi.study.design.create.FactoryMetohd.multi.interface_.Game;

public class PS4Game implements Game {

    @Override
    public void play() {
        System.out.println("play PS4 game");
    }
}
