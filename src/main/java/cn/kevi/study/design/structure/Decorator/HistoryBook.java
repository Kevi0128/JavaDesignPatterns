package cn.kevi.study.design.structure.Decorator;

public class HistoryBook implements Book {

    @Override
    public void value() {
        System.out.println("this is a history book");
    }
}
