package cn.kevi.study.design.action.Memento;

public class Code {

    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Code(String version){
        this.version = version;
    }

    public BackUp createBackUp(){
        return new BackUp(version);
    }

    public void restoreBackUp(BackUp backUp){
        this.version = backUp.getVersion();
    }
}
