package design.adapter.mythink;

public class My5VPower extends MyBasePower{

    public My5VPower(MyAc myAc) {
        super(myAc);
    }

    @Override
    public int changePower() {
        if (myAc!=null){
            return myAc.getSourcePower()/44;
        }
        return super.changePower();
    }
}
