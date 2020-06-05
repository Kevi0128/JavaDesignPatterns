package cn.kevi.study.design.action.Interpreter;

public class InterpreterTest {

    public static void main(String[] main){

        //10+5-3
        int result  = new Minus().interpret(
                new Context(new Plus().interpret(new Context(10,5)), 3));
        System.out.println(result);
    }

}
