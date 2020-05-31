package cn.kevi.study.design.action.Template;

public abstract class AbstractCalculator {

    //主方法，实际使用就是它
    //负责调用本类的其他方法
    public final int calculate(String exp, String opt){
        int num[] = split(exp, opt);
        return calculate(num[0], num[1]);
    }

    //需要子类实现的模板方法
    public abstract int calculate(int num1, int num2);

    public int[] split(String exp, String opt){
        String s[] = exp.split(opt);
        int num[] = new int[2];
        num[0] = Integer.parseInt(s[0]);
        num[1] = Integer.parseInt(s[1]);
        return num;
    }

}
