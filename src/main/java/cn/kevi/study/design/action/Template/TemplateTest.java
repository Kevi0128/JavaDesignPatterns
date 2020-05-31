package cn.kevi.study.design.action.Template;

public class TemplateTest {

    public static void main(String[] args) {
        String exp = "125+125";
        AbstractCalculator cal = new Plus();
        System.out.println(cal.calculate(exp, "\\+"));
    }

}
