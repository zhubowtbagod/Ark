package design.adapter.mythink;

public class MyAc {

    private  int sourcePower =220;


    public int getSourcePower() {
        return sourcePower;
    }

    public void setSourcePower(int sourcePower) {
        this.sourcePower = sourcePower;
    }

    public  int outPut(){
        return sourcePower;
    }
}
