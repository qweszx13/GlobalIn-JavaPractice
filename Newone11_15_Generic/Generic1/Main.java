package Newone11_15_Generic.Generic1;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.set(new Apple());
        box2.set(new Orange());

        System.out.println(box1.get());
        System.out.println(box2.get());
    }
}
