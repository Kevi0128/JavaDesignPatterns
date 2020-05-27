package cn.kevi.study.design.structure.Proxy;

public class NormalPeople implements People {

    @Override
    public void say() {
        System.out.println("I don`t shut him");
    }
}
