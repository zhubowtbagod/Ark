package design.decorator;

public class RXCoffee extends  Coffee{

    public RXCoffee() {
        name="RXCoffee";
    }

    @Override
    public int cost() {
        return 10;
    }
}
