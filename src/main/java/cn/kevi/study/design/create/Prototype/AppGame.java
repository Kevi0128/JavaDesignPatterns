package cn.kevi.study.design.create.Prototype;

import java.io.*;
import java.util.Objects;

public class AppGame implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private GameCore core;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameCore getCore() {
        return core;
    }

    public void setCore(GameCore core) {
        this.core = core;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AppGame appGame = (AppGame) o;
        return Objects.equals(name, appGame.name) &&
                Objects.equals(core, appGame.core);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, core);
    }

    @Override
    public String toString() {
        return "AppGame{" +
                "name='" + name + '\'' +
                ", core=" + core.getUID() +
//                ", core=" + core +
                '}';
    }

    /**
     * 浅复制
     * 基本数据类型的数据会重新创建，但引用类型还是指向原对象所指向的。
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        AppGame appGame = (AppGame) super.clone();
        return appGame;
    }

    /**
     * 深复制
     * 基本数据类型和引用类型都全部重新创建
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        //当前对象转换二进制流并写入
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //输入流读取输出流，创建新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

}
