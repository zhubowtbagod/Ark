package design.adapter.interfaceadapter;

/**
 * 源于 https://blog.csdn.net/qq_36940806/article/details/119679059
 *
 * 但是我感觉不科学 我应该只关心调用ac220V中的输出
 */
public class Client {

    public static void main(String[] args) {
        AC220V ac220V=new AC220V();
        PowerAdapter Adapter5V=new Power5VAdapter(ac220V);
        System.out.println(Adapter5V.output5V());

    }
}
