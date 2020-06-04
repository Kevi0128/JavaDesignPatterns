package cn.kevi.study.design.action.Memento;

public class BackUp {

    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public BackUp(String version){
        this.version = version;
    }
}
