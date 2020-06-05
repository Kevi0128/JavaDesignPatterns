package cn.kevi.study.design.action.Visitor;

//访问者支持接口
public interface Subject {

    //接收访问对象
    void accept(Visitor visitor);

    //返回属性
    Object getSubject();

}
