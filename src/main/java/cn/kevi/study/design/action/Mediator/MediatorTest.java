package cn.kevi.study.design.action.Mediator;

public class MediatorTest {

    public static void main(String[] args) {
        MediatorInterface mediator = new UserMediator();
        mediator.createMediator();
        mediator.work();
    }
}
