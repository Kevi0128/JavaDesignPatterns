package cn.kevi.study.design.structure.Bridge;

public class MyBridge extends Bridge {

    public void info(){
        getDriver().info();
    }

}
