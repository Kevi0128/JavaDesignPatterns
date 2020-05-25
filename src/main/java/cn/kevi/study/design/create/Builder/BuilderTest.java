package cn.kevi.study.design.create.Builder;

import cn.kevi.study.design.create.Builder.bulider.AuthorBuilder;

public class BuilderTest {

    public static void main(String[] args){
        AuthorBuilder builder = new AuthorBuilder();
        builder.getHistoryAuthor(5);
        builder.getSFAuthor(3);
        builder.lookAuthor();
    }

}
