package cn.kevi.study.design.action.ChianOfResponsibility;

public abstract class AbstractControl {

    private Deal deal;

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }
}
