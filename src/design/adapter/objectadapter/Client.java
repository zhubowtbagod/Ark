package design.adapter.objectadapter;


import design.adapter.classadapter.EAdaptee;
import design.adapter.classadapter.Target;

public class Client {

    public static void main(String[] args) {
        EAdaptee eAdaptee=new EAdaptee();
        Target target=new ObjectAdapter(eAdaptee);
        target.request();

    }
}
