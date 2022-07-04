package arksort;

import arksort.entity.Person;
import arksort.util.ComparatorByAge;
import arksort.util.ComparatorByName;

import java.util.*;

public class Client {


    public static void main(String[] args) {

        System.out.println("this is merge1");
        Person p1=new Person("aaa-001",10);
        Person p2=new Person("bbb",20);
        Person p3=new Person("baa",15);
        Person p4=new Person("ccc",30);
        Person p5=new Person("aaa-003",30);

        List<Person> personList =new ArrayList<>();


        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);


        System.out.println(personList);

        Collections.sort(personList,new ComparatorByName());


        System.out.println(personList);




        Collections.sort(personList,new ComparatorByAge());


        System.out.println(personList);


    }
}
