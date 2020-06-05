package cn.kevi.study.design.action.Mediator;

public class Runner extends BaseSet {

    public Runner(MediatorInterface mediator){
        super(mediator);
    }

    public void run(){
        System.out.println("Runner is run");
    }

}
