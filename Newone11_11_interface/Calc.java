package Newone11_11_interface;

public abstract class Calc {
    protected int num1,num2;
    protected int value;

    public abstract int calculate(int num);

    public void setValue(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

}