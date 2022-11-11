package Newone11_11_interface.Test;

public class TestMain {
    public static void main(String[] args) {
        Shape[] shape = {new Circle(10),new Triangle(10, 10),new Rectangle(10, 10)};
        int sumArea = 0;

        for (Shape s : shape) {
            sumArea += s.getArea();
        }
        System.out.println(sumArea);

        Printable sPrint = new PrinterSamsung();
        Printable lPrint = new PrinterLg();

        sPrint.print();
        lPrint.print();

        Object obj = new newCircle(10);

        System.out.println(obj); //출력: 넓이는 100 입니다. (예시)

    }
}
