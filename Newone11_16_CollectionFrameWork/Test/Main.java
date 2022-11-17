package Newone11_16_CollectionFrameWork.Test;

import java.util.Scanner;

public class Main {
    //public static void main(String[] args) {
//        Box<Apple> aBox = new Box<Apple>();
//        Box<Apple> aaBox = new Box<Apple>();
//        Box<Orange> oBox = new Box<Orange>();
//
//        aBox = aaBox;
//
//
//        // 과일을 박스에 담은 것일까?
//        aBox.set(new Apple());
//        oBox.set(new Orange());
//
//        // 박스에서 과일을 제대로 꺼낼 수 있을까?
//        Apple ap = aBox.get();
//        Orange og = oBox.get();
//
//        System.out.println(ap);
//        System.out.println(og);
//
//        DBox<String, Integer> box = new DBox<String, Integer>();
//        box.set("Apple", 25);
//        System.out.println(box);


       // 출력: 25살 사과
    //}

//Box를 제네릭으로만드시오

//    철수 학생은 다음 3개의 필드와 메소드를 가진 4개의 클래스 Add, Sub, Mul, Div를 작성하려고 한다
//
//    int 타입의 a, b 필드: 2개의 피연산자
//    void setValue(int a, int b): 피연산자 값을 객체 내에 저장한다.
//    int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.
//    곰곰 생각해보니, Add, Sub, Mul, Div 클래스에 공통된 필드와 메소드가 존재하므로 새로운 추상 클래스 Calc를 작성하고 Calc를 상속받아 만들면 되겠다고 생각했다. 그리고 main() 메소드에서 다음 실행 사례와 같이 2개의 정수와 연산자를 입력받은 후, Add, Sub, Mul, Div 중에서 이 연산을 처리할 수 있는 객체를 생성하고 setValue() 와 calculate()를 호출하여 그 결과 값을 화면에 출력하면 된다고 생각하였다. 철수처럼 프로그램을 작성하라.
//    두 정수와 연산자를 입력하시오 >> 5 7 +

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Calculate cal = null;
//        int num = scan.nextInt();
//        int num2 = scan.nextInt();
//        char numC = scan.next().charAt(0);
//        System.out.println(num+"  "+num2+"  "+numC);
//
//
//        switch (numC){
//            case '+' :
//                cal = new Sum();
//                break;
//            case '-' :
//                cal = new Min();
//                break;
//            case '*' :
//                cal = new Mul();
//                break;
//            case '/' :
//                cal = new Div();
//                break;
//        }
//        cal.setValue(num,num2);
//        System.out.println(cal.calc());
//    }
    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        System.out.println(p1.equals(new Person("홍길동")));
        System.out.println(p1.equals(new Person("최명태")));

    }
}
