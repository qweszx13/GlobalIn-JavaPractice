package Newone11_09;

public class Main {
    // Cake,CheeseCake
//    public static void main(String[] args) {
//        CheeseCake ca1 = new CheeseCake();
//        Cake ca2 = new CheeseCake();
//        Cake ca3 = new Cake();
//
//        ca1.yummy();//자식=자식
//        ca2.yummy();//부모=자식->부모는 자식이 재정의한 yummy 메소드를 가지고 데이터 에 올림
//        ca3.yummy();//부모=부모
//
//        ca2.sweet();
//        //ca2.milky(); 당연불가능 부모타입에 아예없는 milky
//        ca1.milky();
//        ca1.sweet();
//    }
    //Triangle,Newone11_05.Circle-

//    static double geteArea(Newone11_05.Circle circle){ 이렇게 짤래?
//        return circle.getArea();
//    }
//    static double geteArea(Triangle circle){
//        return circle.getArea();
//    }
//    static double geteArea(Shape shape){ 이렇게 한번에 짤래? 오버라이딩적용가능
//        return shape.getArea();
//    }

//    public static void main(String[] args) {
//        double sumArea = 0;
//        Newone11_05.Circle cir = new Newone11_05.Circle(10);
//        Triangle tri = new Triangle(10,10);
//
//        sumArea = cir.getArea()+tri.getArea();//공통 getArea 부모로 빼주세요
//
//        System.out.println("고객님 넓이는"+sumArea+"입니다.");
//
//        //
//        double sumArea2 = 0.0;
//        Shape[] shape = {new Newone11_05.Circle(10),new Triangle(10,10)};
//
//        for(Shape s : shape){
//            sumArea2 += s.getArea();//함수 오버라이딩은 자식꺼
//        }
//
//        System.out.println("고객님 넓이는"+sumArea2+"입니다2");
//    }
    //Boxing
//    public static void main(String[] args) {
//        Box box1 = new Box();
//        PaperBox box2 = new PaperBox();
//        GoldBox box3 = new GoldBox();
//
//        wrapBox(box1);
//        wrapBox(box2);
//        wrapBox(box3);
//
//    }
//    public static void wrapBox(Box box){
//        if(box instanceof GoldBox){
//            ((GoldBox)box).goldWrap();
//        }else if(box instanceof PaperBox){
//            ((PaperBox)box).paperWrap();
//        }else{
//            box.simpleWrap();
//        }
//    }
    //CheeseCake cake toString()
    public static void main(String[] args) {
        Cake cake = new Cake();
        Cake cheeseCake = new CheeseCake();

        System.out.println(cake);
        System.out.println(cheeseCake);
        System.out.println("??");
    }

}
