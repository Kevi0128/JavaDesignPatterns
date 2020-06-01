package cn.kevi.study.design.action.Iterator;

import java.util.Vector;

public class MyGameCollection implements Collection {

    public Vector<String> string = new Vector<>();

    @Override
    public Item item() {
        return new Game(this);
    }

    @Override
    public Object get(int i) {
        return string.get(i);
    }

    @Override
    public void add(String s) {
        string.addElement(s);
    }

    @Override
    public int size() {
        return string.size();
    }


}
