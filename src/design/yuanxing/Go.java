package design.yuanxing;

public class Go {


    public static void main(String[] args) throws CloneNotSupportedException {

        Student student1=new Student("张三",5);
        Student student2= (Student) student1.clone();
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        student1.setAge(10);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }

}
