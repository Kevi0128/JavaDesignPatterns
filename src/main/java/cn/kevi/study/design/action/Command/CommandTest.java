package cn.kevi.study.design.action.Command;

public class CommandTest {

    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Command command = new NormalCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }

}
