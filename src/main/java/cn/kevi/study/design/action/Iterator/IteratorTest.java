package cn.kevi.study.design.action.Iterator;

public class IteratorTest {

    public static void main(String[] args){
        Collection collection = new MyGameCollection();
        collection.add("P5");
        collection.add("WITCH3");
        collection.add("WastLand");
        collection.add("CS");

        Item item = collection.item();
        while (item.hasNext()){
            System.out.println(item.next());
        }
    }

}
