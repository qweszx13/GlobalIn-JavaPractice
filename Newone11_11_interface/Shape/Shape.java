package Newone11_11_interface.Shape;
//인터페이스의 장점
//1.클래스로 상속을 이용하게 되면 불필요한 함수들도 같이 상속받게된다.
//2.다중 상속이? 구현이 가능하다.
//3.불필요한 dummy를 만들 필요가 없다.
//4.업무의 효율성을 가질수있다.
/*
ex) public class Shpae(){
    double getArea(){
        return 0.0;<-요런 더미 잘못사용하면 0.0을 리턴받을수있음
    }
}
* */
interface Shape {
    double getArea();
}
