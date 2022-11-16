package Newone11_15_Generic.Generic2;

public class Main {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<Apple>();
        Box<Orange> box2 = new Box<Orange>();

        box1.set(new Apple());
        box2.set(new Orange());

        Apple ap = box1.get();
        Orange og = box2.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
