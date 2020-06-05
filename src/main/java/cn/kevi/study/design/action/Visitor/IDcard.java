package cn.kevi.study.design.action.Visitor;

//一个实体类，实现了对访问者的支持
public class IDcard implements Subject {

    private String name;
    private int age;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Object getSubject() {
        return age;
    }

    public IDcard(String name, int age, String number){
        this.name = name;
        this.age = age;
        this.number = number;
    }

    @Override
    public String toString() {
        return "IDcard{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                '}';
    }
}
