package cn.kevi.study.design.create.Builder.impl;

import cn.kevi.study.design.create.Builder.interface_.Author;

public class HistoryAuthor implements Author {

    @Override
    public void create() {
        System.out.println("author write history story");
    }
}
