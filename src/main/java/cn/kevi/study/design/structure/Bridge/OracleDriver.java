package cn.kevi.study.design.structure.Bridge;

public class OracleDriver implements Driver {

    @Override
    public void info() {
        System.out.println("this is a Driver for Oracle");
    }
}
