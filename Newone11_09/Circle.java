package Newone11_09;

public class Circle extends Shape{
    private int r;

    public Circle(int r){
        this.r = r;
    }

    @Override
    public double getArea(){
        return r*r*Math.PI;
    }
}
