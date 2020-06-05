package cn.kevi.study.design.action.Mediator;

public class UserMediator implements MediatorInterface {

    private Runner runner;
    private Diver diver;

    public Runner getRunner() {
        return runner;
    }

    public Diver getDiver() {
        return diver;
    }

    @Override
    public void createMediator() {
        runner = new Runner(this);
        diver = new Diver(this);
    }

    @Override
    public void work() {
        runner.run();
        diver.dive();
    }
}
