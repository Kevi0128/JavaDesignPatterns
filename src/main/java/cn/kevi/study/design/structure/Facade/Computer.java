package cn.kevi.study.design.structure.Facade;

public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup(){
        System.out.println("start the computer");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("computer started");
    }

    public void shutdown(){
        System.out.println("close the computer");
        disk.shutdown();
        memory.shutdown();
        cpu.shutdown();
        System.out.println("computer shutdown");
    }
}
