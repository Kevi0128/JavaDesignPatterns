package cn.kevi.study.design.action.Observer;

public class LookerA implements Looker {

    @Override
    public void change() {
        System.out.println("lookerA start change");
    }

}
