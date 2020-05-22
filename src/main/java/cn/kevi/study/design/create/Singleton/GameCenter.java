package cn.kevi.study.design.create.Singleton;

public class GameCenter {

    //单例模式的核心就是这个
    //静态私有自身
    private static GameCenter instance = null;

    //私有构造方法，避免意外实例化
    private GameCenter(){
    }

    private static synchronized void syncInit(){
        if (instance == null){
            instance = new GameCenter();
        }
    }

    public static GameCenter getInstance(){
        if (instance == null){
            //使用方法创建实列
            //避免多线程并发创建
            //转移synchronized关键字位置，避免多余的性能消耗
            syncInit();
        }
        return instance;
    }

    //序列化备用方法
    //用于保证对象在序列化前后保证一致
    public Object readResolve(){
        return instance;
    }
}
