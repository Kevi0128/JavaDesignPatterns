package cn.kevi.study.design.structure.Adapter.Object_;

public class ObjectAdapterTest {

    public static void main(String[] args){
        TerrariaCore terrariaCore = new TerrariaCore();
        TerrariaPlayer terrariaPlayer = new TerrariaPlayer(terrariaCore);

        terrariaPlayer.info();
        terrariaPlayer.player();

    }

}
