package design.xiangyuan;

public class Client {

    public static void main(String[] args) {
        Website wangyiWeb=WebSiteFactory.getWebSite("wangyi");
        wangyiWeb.use(new User("dinglei"));
    }
}
