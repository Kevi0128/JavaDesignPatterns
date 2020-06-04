package cn.kevi.study.design.action.ChianOfResponsibility;

public class MyWork extends AbstractControl implements Deal {

    @Override
    public void deal(String thing) {
        if (thing.contains("java")){
            System.out.println("I finish work by java");
        }else {
            if (getDeal() != null){
                getDeal().deal(thing);
            }
        }
    }
}
