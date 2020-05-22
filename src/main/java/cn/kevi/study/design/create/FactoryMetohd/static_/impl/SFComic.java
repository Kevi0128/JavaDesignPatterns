package cn.kevi.study.design.create.FactoryMetohd.static_.impl;

import cn.kevi.study.design.create.FactoryMetohd.static_.interface_.Comic;

public class SFComic implements Comic {

    @Override
    public void create() {
        System.out.println("create SF comic");
    }
}
