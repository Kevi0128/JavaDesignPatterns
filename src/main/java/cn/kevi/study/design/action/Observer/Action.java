package cn.kevi.study.design.action.Observer;

public interface Action {

    //添加观察者
    void add(Looker looker);

    //删除观察者
    void del(Looker looker);

    //通知所有观察者
    void notifyLooker();

    //自身的操作
    void operation();

}
