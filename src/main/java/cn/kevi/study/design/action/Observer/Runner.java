package cn.kevi.study.design.action.Observer;

public class Runner extends AbstractAction {

    @Override
    public void operation() {
        System.out.println("runner did something");
        //被观察者发生变化了
        //通知观察者
        notifyLooker();
    }
}
