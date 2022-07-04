package design.prototype;

import java.io.*;

public class PrototypeEntity implements Cloneable ,Serializable{


    @Serial
    private static final long serialVersionUID = 3056410063162406917L;
    private String name;
    private int age;

    private PrototypeChild child;

    public PrototypeEntity() {
    }

    public PrototypeEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PrototypeEntity(String name, int age, PrototypeChild child) {
        this.name = name;
        this.age = age;
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PrototypeChild getChild() {
        return child;
    }

    public void setChild(PrototypeChild child) {
        this.child = child;
    }


    /**
     * 原型模式 是浅拷贝 要实现深拷贝 方法两个：
     * 1,变量也实现 Cloneable 接口 缺点：如果多个对象变量 则需要每个都重写
     * 2.流方式
     *
     *  其他：实现 深拷贝也可以使用
     *
     *    通过Gson进行JSON序列化JSON Serialization With Gson
     *    通过jackson进行JSON序列化
     *    Apache Commons Lang
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        /**
         * 方式1 start
         */
//        PrototypeEntity entity= (PrototypeEntity) super.clone();
//        entity.setChild((PrototypeChild) child.clone());
//        return entity;
        /**
         * 方式1 end
         */

        /**
         * 方式2 start
         */
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        PrototypeEntity entity = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            entity = (PrototypeEntity) ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            try {
                if (ois != null) {
                    ois.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (oos != null) {
                    oos.close();
                }
                if (bos != null) {
                    bos.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        return entity;
        /**
         * 方式2 end
         */


    }
}
