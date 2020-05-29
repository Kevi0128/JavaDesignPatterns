package cn.kevi.study.design.structure.Bridge;

public class BridgeTest {

    public static void main(String[] rags){
        Bridge bridge = new MyBridge();
        //对接第一个
        MysqlDriver mysqlDriver = new MysqlDriver();
        bridge.setDriver(mysqlDriver);
        bridge.info();

        //对接第二个
        OracleDriver oracleDriver = new OracleDriver();
        bridge.setDriver(oracleDriver);
        bridge.info();
    }

}
