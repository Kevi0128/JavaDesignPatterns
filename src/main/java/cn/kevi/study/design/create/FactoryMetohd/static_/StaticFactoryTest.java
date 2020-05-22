package cn.kevi.study.design.create.FactoryMetohd.static_;

import cn.kevi.study.design.create.FactoryMetohd.static_.factory.ComicFactory;
import cn.kevi.study.design.create.FactoryMetohd.static_.interface_.Comic;

public class StaticFactoryTest {

    public static void main(String[] args){
        Comic sfcomic = ComicFactory.getSFAuthor();
        sfcomic.create();
    }

}
