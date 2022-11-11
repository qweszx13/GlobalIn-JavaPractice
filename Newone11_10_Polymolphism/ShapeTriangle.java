package Newone11_10_Polymolphism;

import Newone11_09.Shape;

public class ShapeTriangle extends Shape {
    private int width,height;

    public ShapeTriangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width*height/2.0;

    }

    @Override
    public String toString() {
        return getArea()+"";
    }
}
