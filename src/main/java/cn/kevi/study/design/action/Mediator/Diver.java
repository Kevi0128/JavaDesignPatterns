package cn.kevi.study.design.action.Mediator;

public class Diver extends BaseSet {

    public Diver(MediatorInterface mediator){
        super(mediator);
    }

    public void dive(){
        System.out.println("Diver is dive");
    }

}
