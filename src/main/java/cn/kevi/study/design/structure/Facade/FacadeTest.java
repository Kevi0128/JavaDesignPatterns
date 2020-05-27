package cn.kevi.study.design.structure.Facade;

public class FacadeTest {

    public static void main(String[] args){
        Computer computer = new Computer();
        computer.startup();
        System.out.println("some time left");
        computer.shutdown();
    }

}
