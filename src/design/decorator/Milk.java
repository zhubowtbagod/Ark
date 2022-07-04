package design.decorator;

public class Milk extends Mixed{

    public Milk(Drink mDrink) {
        super(mDrink);
    }

    @Override
    public int cost() {
        return 3;
    }

}
