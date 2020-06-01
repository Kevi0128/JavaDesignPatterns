package cn.kevi.study.design.action.Iterator;

public interface Collection {

    Item item();

    //取得集合中的一个
    Object get(int i);

    //添加项目
    void add(String s);

    //取得集合大小
    int size();

}
