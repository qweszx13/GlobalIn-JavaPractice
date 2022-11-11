package Newone11_10_Polymolphism;

public class TestShape {
    public static void main(String[] args) {
        double sumArea = 0;
        Shape[] shape = new Shape[]{new Circle(10), new Triangle(10, 10), new Rectangle(10, 10)};

        for (Shape s : shape) {
            sumArea += s.getArea();
            System.out.println(s.getArea());
        }
        System.out.println(sumArea);
    }
}
