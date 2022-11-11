package Newone11_11_interface.Printe;

public interface Printable {
    void print(String doc);
    default void printrMVK(String doc){
        System.out.println("컬러 프린트");
    }
}
