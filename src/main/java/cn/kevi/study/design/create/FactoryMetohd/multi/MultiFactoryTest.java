package cn.kevi.study.design.create.FactoryMetohd.multi;

import cn.kevi.study.design.create.FactoryMetohd.multi.factory.GameFactory;
import cn.kevi.study.design.create.FactoryMetohd.multi.interface_.Game;

public class MultiFactoryTest {

    public static void main(String[] args){
        GameFactory factory = new GameFactory();
        Game game = factory.getPS4();
        game.play();
    }

}
