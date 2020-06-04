package cn.kevi.study.design.action.Command;

public class NormalCommand implements Command {

    private Receiver receiver;

    public NormalCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
