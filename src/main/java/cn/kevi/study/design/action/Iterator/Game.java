package cn.kevi.study.design.action.Iterator;

public class Game implements Item {

    private Collection collection;
    private int pos = -1;

    public Game(MyGameCollection collection){
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if (pos > 0)
            pos--;
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if (pos < collection.size())
            pos++;
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if (pos < collection.size()-1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(0);
    }
}
