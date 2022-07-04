package design.prototype;

/**
 * 原型设计模式
 */
public class PrototypeMain {


    public static void main(String[] args) {



        try {
            PrototypeEntity entity=new PrototypeEntity("name",10,new PrototypeChild("child",20));
            PrototypeEntity entity1= (PrototypeEntity) entity.clone();
            PrototypeEntity entity2= (PrototypeEntity) entity.clone();
            System.out.println(entity.hashCode());
            System.out.println(entity1.hashCode());
            System.out.println(entity2.hashCode());
            System.out.println("------");
            System.out.println(entity.getChild().hashCode());
            System.out.println(entity1.getChild().hashCode());
            System.out.println(entity2.getChild().hashCode());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
