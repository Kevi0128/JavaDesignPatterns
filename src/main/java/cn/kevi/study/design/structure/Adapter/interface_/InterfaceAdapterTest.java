package cn.kevi.study.design.structure.Adapter.interface_;

public class InterfaceAdapterTest {

    public static void main(String[] args){
        XCOMPlayer player = new XCOMPlayer();
        XCOMMap map = new XCOMMap();

        System.out.println("player:");
        player.player();
        player.map();

        System.out.println("map:");
        map.player();
        map.map();

    }

}
