package cn.kevi.study.design.structure.Adapter.Object_;

public class TerrariaPlayer implements CoreExtend {

    private TerrariaCore terrariaCore;

    public TerrariaPlayer(TerrariaCore terrariaCore){
        super();
        this.terrariaCore = terrariaCore;
    }

    @Override
    public void info() {
        terrariaCore.info();
    }

    @Override
    public void player() {
        System.out.println("terraria player created");
    }
}
