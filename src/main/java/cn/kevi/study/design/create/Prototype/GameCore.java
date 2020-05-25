package cn.kevi.study.design.create.Prototype;

import java.io.Serializable;

public class GameCore implements Serializable {

    private static final long serialVersionUID = 1L;

    public void lookUID(){
        System.out.println(serialVersionUID);
    }

    public long getUID(){
        return serialVersionUID;
    }
}
