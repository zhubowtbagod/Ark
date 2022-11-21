package design.adapter.classadapter;

public class Client {


    public static void main(String[] args) {
        Target target=new EAdapter();
        target.request();
    }

}
