package Newone11_11_interface.Shape;

public class ShapeMain {
    public static void main(String[] args) {
        double sumArea = 0;
        ShapeCircle cir = new ShapeCircle(10);
        ShapeTriangle tri = new ShapeTriangle(10,10);

        sumArea = cir.getArea()+tri.getArea();//공통 getArea 부모로 빼주세요



        System.out.println("원넓이"+cir+"트라이앵글넓이"+tri+"고객님 넓이는"+sumArea+"입니다.");

//        //
//        double sumArea2 = 0.0;
//        Shape[] shape = {new ShapeCircle(10),new ShapeTriangle(10,10)};
//
//        for(Shape s : shape){
//            sumArea2 += s.getArea();//함수 오버라이딩은 자식꺼
//        }

//        System.out.println("고객님 넓이는"+sumArea2+"입니다2");
    }
}
