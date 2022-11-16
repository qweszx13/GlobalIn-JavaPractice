package Newone11_15_Generic.Test;

abstract class Calculator {
    protected int a,b;

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public abstract int calculate();
}
