package cn.kevi.study.design.action.Mediator;

public abstract  class BaseSet {

    private MediatorInterface mediator;

    public MediatorInterface getMediator(){
        return mediator;
    }

    public BaseSet(MediatorInterface mediator){
        this.mediator = mediator;
    }

}
