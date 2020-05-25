package cn.kevi.study.design.create.Builder.bulider;

import cn.kevi.study.design.create.Builder.impl.HistoryAuthor;
import cn.kevi.study.design.create.Builder.impl.SFAuthor;
import cn.kevi.study.design.create.Builder.interface_.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorBuilder {

    private List<Author> authorList = new ArrayList<>();

    public void getHistoryAuthor(int num){
        for (int i=0; i<num; i++){
            authorList.add(new HistoryAuthor());
        }
    }

    public void getSFAuthor(int num){
        for (int i=0; i<num; i++){
            authorList.add(new SFAuthor());
        }
    }

    public void lookAuthor(){
        for (Author author : authorList){
            author.create();
        }
    }
}
