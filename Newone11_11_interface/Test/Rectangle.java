package Newone11_11_interface.Test;

public class Rectangle extends Shape {
    int i,i1;
    public Rectangle(int i, int i1) {
        super();
        this.i = i;
        this.i1 = i1;
    }

    @Override
    public double getArea() {
        return i*i1;
    }
}
