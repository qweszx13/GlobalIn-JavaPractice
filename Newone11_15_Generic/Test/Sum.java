package Newone11_15_Generic.Test;

public class Sum implements Calc {
    int a = 0;
    int b = 0;
    @Override
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() {
        return this.a+this.b;
    }
}
