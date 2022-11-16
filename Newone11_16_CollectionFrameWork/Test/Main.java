package Newone11_16_CollectionFrameWork.Test;

public class Main {
    public static void main(String[] args) {
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

        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box);


       // 출력: 25살 사과
    }

//Box를 제네릭으로만드시오
}
