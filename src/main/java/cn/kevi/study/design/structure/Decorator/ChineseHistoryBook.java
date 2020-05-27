package cn.kevi.study.design.structure.Decorator;

public class ChineseHistoryBook implements Book {

    private HistoryBook book;

    public ChineseHistoryBook(HistoryBook book){
        super();
        this.book = book;
    }

    @Override
    public void value() {
        System.out.println("this a book about china");
        book.value();
    }
}
