package Newone11_10;

import Newone11_09.Shape;

public class ShapeCircle extends Shape {
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
