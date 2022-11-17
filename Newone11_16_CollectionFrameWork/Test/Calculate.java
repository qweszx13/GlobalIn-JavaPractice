package Newone11_16_CollectionFrameWork.Test;

public abstract class Calculate {
    protected int num1;
    protected int num2;

    public void setValue(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract int calc();

}
