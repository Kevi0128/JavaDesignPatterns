package cn.kevi.study.design.action.Visitor;

public class VisitorTest {

    public static void main(String[] args){
        IDcard card = new IDcard("K", 18, "123456789");
        TimeGone timeGone = new TimeGone();
        card.accept(timeGone);
    }

}
