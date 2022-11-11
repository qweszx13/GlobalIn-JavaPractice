package Newone11_11_interface.Printe;

public class PrintDriver2 implements Printable{

    @Override
    public void print(String doc) {
        System.out.println("블랙 지원");
    }

    @Override
    public void printrMVK(String doc) {
        System.out.println(doc+"출력");
        System.out.println("컬러");
    }
}
