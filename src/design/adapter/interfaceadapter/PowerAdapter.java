package design.adapter.interfaceadapter;

public abstract class PowerAdapter implements DC{


    protected AC220V ac220V;

    public PowerAdapter(AC220V ac220V) {
        this.ac220V = ac220V;
    }

    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output110V() {
        return 0;
    }

    @Override
    public int output22V() {
        return 0;
    }
}
