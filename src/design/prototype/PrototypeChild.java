package design.prototype;

import java.io.Serial;
import java.io.Serializable;

public class PrototypeChild implements Cloneable , Serializable {

    @Serial
    private static final long serialVersionUID = 4658964978482402303L;
    private String childName;
    private int childAge;

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }

    public PrototypeChild() {
    }

    public PrototypeChild(String childName, int childAge) {
        this.childName = childName;
        this.childAge = childAge;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
