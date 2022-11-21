package design.yuanxing;

public class Student implements Cloneable {

    private String name;
    private int age;

    public Student(){}


    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "yuanxing.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
