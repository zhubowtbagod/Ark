package design.xiangyuan;

/**
 * 享元模式 外部类
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

