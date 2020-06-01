package cn.kevi.study.design.action.Iterator;

public interface Item {

    //前移
    Object previous();

    //后移
    Object next();

    //后移量检测
    boolean hasNext();

    //取得第一个元素
    Object first();

}
