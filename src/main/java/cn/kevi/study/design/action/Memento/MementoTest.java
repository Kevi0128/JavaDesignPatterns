package cn.kevi.study.design.action.Memento;

public class MementoTest {

    public static void main(String[] args){
        Code code = new Code("0.5.1");
        BackUp backUp = code.createBackUp();
        BackUpSave save = new BackUpSave();
        save.save("1", backUp);
        System.out.println("ver:" + code.getVersion());
        code.setVersion("0.6.8");
        System.out.println("ver:" + code.getVersion());
        code.restoreBackUp(save.getSave("1"));
        System.out.println("ver:" + code.getVersion());
    }

}
