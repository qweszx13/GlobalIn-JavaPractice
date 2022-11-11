package Newone11_11_interface.Printe;

public class PrintDriver implements Printable{
    @Override
    public void print(String doc) {
        printrMVK("프린트");
        System.out.println("삼성드라이버");
        System.out.println(doc);
    }

    @Override
    public void printrMVK(String doc) {
        System.out.println("함수오버라이딩 적용됨");
    }
}
