package cn.kevi.study.design.action.Memento;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BackUpSave {

    private Map<String, BackUp> save = new ConcurrentHashMap<>();

    public void save(String key, BackUp backUp){
        save.put(key,backUp);
    }

    public BackUp getSave(String key){
        return save.get(key);
    }

}
