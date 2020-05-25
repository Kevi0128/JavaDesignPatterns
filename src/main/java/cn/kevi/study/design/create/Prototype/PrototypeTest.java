package cn.kevi.study.design.create.Prototype;

public class PrototypeTest {

    public static void main(String[] args){

        GameCore core = new GameCore();
        core.lookUID();
        AppGame appGame = new AppGame();
        appGame.setCore(core);
        appGame.setName("原型");
        System.out.println(appGame);
        try {
            AppGame clone = (AppGame) appGame.clone();
            System.out.println(clone);
            AppGame deep = (AppGame) appGame.deepClone();
            System.out.println(deep);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
