package cn.kevi.study.design.create.FactoryMetohd.multi.factory;

import cn.kevi.study.design.create.FactoryMetohd.multi.impl.NSGame;
import cn.kevi.study.design.create.FactoryMetohd.multi.impl.PS4Game;
import cn.kevi.study.design.create.FactoryMetohd.multi.impl.XboxGame;
import cn.kevi.study.design.create.FactoryMetohd.multi.interface_.Game;

public class GameFactory {

    public Game getPS4(){
        return new PS4Game();
    }

    public Game getXbox(){
        return new XboxGame();
    }

    public Game getNS(){
        return new NSGame();
    }

}
