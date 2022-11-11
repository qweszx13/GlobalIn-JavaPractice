package Newone11_11_interface.Shape;

public class ShapeCircle implements Shape {
    private int r;

    public ShapeCircle(int r){
        this.r = r;
    }

    @Override
    public double getArea(){
        return r*r*Math.PI;
    }

    @Override
    public String toString() {
        return getArea()+"";
    }
}
