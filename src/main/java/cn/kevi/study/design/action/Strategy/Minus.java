package cn.kevi.study.design.action.Strategy;

public class Minus extends AbstractCalculator implements ICalculator {

    public int calculate(String exp) {
        int num[] = split(exp, "-");
        return num[0]-num[1];
    }

}
