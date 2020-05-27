package cn.kevi.study.design.structure.Proxy;

public class Lawyer implements People {

    private NormalPeople normalPeople;

    public Lawyer(){
        super();
        this.normalPeople = new NormalPeople();
    }

    @Override
    public void say() {
        sayHello();
        normalPeople.say();
        did();
    }

    private void sayHello(){
        System.out.println("sir, I`m this man`s Lawyer");
    }

    private void did(){
        System.out.println("so, I think him can be free");
    }
}
