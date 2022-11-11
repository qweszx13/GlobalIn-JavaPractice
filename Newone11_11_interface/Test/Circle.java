package Newone11_11_interface.Test;

public class Circle extends Shape{
    int i=0;
    public Circle(int i) {
        super();
        this.i = i;
    }

    @Override
    public double getArea() {
        return i*Math.PI;
    }
}
