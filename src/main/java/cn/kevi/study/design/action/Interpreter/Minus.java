package cn.kevi.study.design.action.Interpreter;

public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getA() - context.getB();
    }
}
