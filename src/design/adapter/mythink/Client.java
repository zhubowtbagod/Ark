package design.adapter.mythink;

public class Client {


    public static void main(String[] args) {
        MyAc ac220V=new MyAc();
        MyBasePower power5V=new My5VPower(ac220V);
        System.out.println(power5V.changePower());
    }

}
