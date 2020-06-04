package cn.kevi.study.design.action.ChianOfResponsibility;

public class CppWork extends AbstractControl implements Deal{

    @Override
    public void deal(String thing) {
        if (thing.contains("C++")){
            System.out.println("I finish work by C++");
        }else {
            if (getDeal() != null){
                getDeal().deal(thing);
            }
        }
    }
}
