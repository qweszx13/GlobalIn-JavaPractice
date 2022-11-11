package Newone11_10_Polymolphism;

public class Circle extends Shape {
    public int i =0;
    public Circle(int i) {
        super();
        this.i = i;
    }

    @Override
    public double getArea() {
        return i*Math.PI;
    }
}
