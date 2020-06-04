package cn.kevi.study.design.action.ChianOfResponsibility;

public class HtmlWork extends AbstractControl implements Deal {

    @Override
    public void deal(String thing) {
        if (thing.contains("Html")){
            System.out.println("I finish work by Html");
        }else {
            if (getDeal() != null){
                getDeal().deal(thing);
            }
        }
    }
}
