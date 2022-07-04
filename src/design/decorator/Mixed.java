package design.decorator;

public class Mixed implements Drink{

    public Drink mDrink;

    public Mixed(Drink mDrink) {
        this.mDrink = mDrink;
    }

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public String toString() {
        return "Mixed{" +
                "mDrink=" + mDrink +
                "价格为："+(cost()+ mDrink.cost())+
                '}';
    }
}
