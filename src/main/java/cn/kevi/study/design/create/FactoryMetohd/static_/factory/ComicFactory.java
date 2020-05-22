package cn.kevi.study.design.create.FactoryMetohd.static_.factory;

import cn.kevi.study.design.create.FactoryMetohd.static_.impl.ActionComic;
import cn.kevi.study.design.create.FactoryMetohd.static_.impl.OtherWorldComic;
import cn.kevi.study.design.create.FactoryMetohd.static_.impl.SFComic;
import cn.kevi.study.design.create.FactoryMetohd.static_.interface_.Comic;

public class ComicFactory {

    public static Comic getActionAuthor(){
        return new ActionComic();
    }

    public static Comic getSFAuthor(){
        return new SFComic();
    }

    public static Comic getOtherWorldAuthor(){
        return new OtherWorldComic();
    }

}
