package design.xiangyuan;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {

    public  static Map<String,Website> websiteMap=new HashMap<>();


    public static Website  getWebSite(String type){
        if (!websiteMap.containsKey(type)){
            websiteMap.put(type,new ConcreteWebSite(type));
        }
        return  websiteMap.get(type);
    }

}
