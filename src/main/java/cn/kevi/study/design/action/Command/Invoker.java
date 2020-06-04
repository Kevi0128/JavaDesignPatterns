package cn.kevi.study.design.action.Command;

public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
