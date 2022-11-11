package Newone11_11_interface.Shape;

public class ShapeTriangle implements Shape {
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
