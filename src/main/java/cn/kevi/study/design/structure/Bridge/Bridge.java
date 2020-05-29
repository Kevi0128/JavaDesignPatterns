package cn.kevi.study.design.structure.Bridge;

public abstract class Bridge {

    private Driver driver;

    public void info(){
        driver.info();
    }

    public Driver getDriver(){
        return driver;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }
}
