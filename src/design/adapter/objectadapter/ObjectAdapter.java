package design.adapter.objectadapter;


import design.adapter.classadapter.EAdaptee;
import design.adapter.classadapter.Target;

public class ObjectAdapter implements Target {

    private EAdaptee eAdaptee;

    public ObjectAdapter(EAdaptee eAdaptee) {
        this.eAdaptee = eAdaptee;
    }

    @Override
    public void request() {
        eAdaptee.specificRequest();
    }
}
