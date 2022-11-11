package Newone11_11_interface.Test;

public class Triangle extends Shape {
    int i,i1;
    public Triangle(int i, int i1) {
        super();
        this.i = i;
        this.i1 = i1;
    }

    @Override
    public double getArea() {
        return i*i1*1/3;
    }
}
