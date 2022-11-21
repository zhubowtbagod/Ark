package design.adapter.classadapter;

public class EAdapter extends EAdaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
