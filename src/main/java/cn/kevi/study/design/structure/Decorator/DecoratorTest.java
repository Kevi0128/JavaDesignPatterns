package cn.kevi.study.design.structure.Decorator;

public class DecoratorTest {

    public static void main(String[] args){
        HistoryBook historyBook = new HistoryBook();
        ChineseHistoryBook book = new ChineseHistoryBook(historyBook);
        book.value();
    }

}
