package cn.kevi.study.design.action.State;

public class GameTime {

    private String use;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public void playNS(){
        System.out.println("《塞尔达：荒野之息》游戏中");
    }

    public void playPS4(){
        System.out.println("《P5R》游戏中");
    }

    public void playXBOX(){
        System.out.println("《战争机器10》游戏中");
    }
}
