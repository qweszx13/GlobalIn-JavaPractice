package Newone11_17_CollectionFrameWork.Test;

public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        System.out.println(p1.equals(new Person("홍길동")));
        System.out.println(p1.equals(new Person("최명태")));
    }
}
