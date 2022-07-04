package design.decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        Drink oder=new RXCoffee();
        System.out.println(oder.toString());
        oder=new Milk(oder);
        System.out.println("--------------");
        System.out.println(oder.toString());

    }

}
