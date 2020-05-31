package cn.kevi.study.design.action.Observer;

public class ObserverTest {

    public static void main(String[] args){
        Runner runner = new Runner();
        runner.add(new LookerA());
        runner.add(new LookerB());
        runner.operation();
    }

}
