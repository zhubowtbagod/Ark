package design.xiangyuan;

/**
 * 具体享元角色
 */
public class ConcreteWebSite extends Website{

    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    void use(User user) {
        System.out.println("这是:"+user.getName()+",类型:"+type);
    }
}
