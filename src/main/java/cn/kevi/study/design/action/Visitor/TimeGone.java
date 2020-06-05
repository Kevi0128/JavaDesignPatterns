package cn.kevi.study.design.action.Visitor;

public class TimeGone implements Visitor {

    @Override
    public void visit(Subject subject) {
        int age = (int)subject.getSubject() + 10;
        System.out.println("10年过后年龄为:" + age);
    }
}
