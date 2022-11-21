package design.adapter.mythink;

public abstract class MyBasePower implements PowerChange{

    protected MyAc myAc;


    public MyBasePower(MyAc myAc) {
        this.myAc = myAc;
    }

    @Override
    public int changePower() {
        return 0;
    }

}
