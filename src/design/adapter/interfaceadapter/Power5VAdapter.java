package design.adapter.interfaceadapter;

public class Power5VAdapter extends PowerAdapter{

    public Power5VAdapter(AC220V ac220V) {
        super(ac220V);
    }

    @Override
    public int output5V() {
        if (ac220V!=null){
            return 5;
        }
        return 0;
    }


}
