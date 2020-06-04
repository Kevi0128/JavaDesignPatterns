package cn.kevi.study.design.action.ChianOfResponsibility;

public class ChianTest {

    public static void main(String[] args){
        MyWork work = new MyWork();
        CppWork cpp = new CppWork();
        HtmlWork html = new HtmlWork();
        work.setDeal(cpp);
        cpp.setDeal(html);

        work.deal("do your work by C++");

    }

}
