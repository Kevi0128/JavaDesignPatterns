package cn.kevi.study.design.structure.Bridge;

public class MysqlDriver implements Driver {

    @Override
    public void info() {
        System.out.println("this is a driver for mysql");
    }
}
