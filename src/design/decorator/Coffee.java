package design.decorator;

public class Coffee  implements  Drink{

    protected  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int cost() {
        return 5;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                "价格="+cost()+
                '}';
    }
}
