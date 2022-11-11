package Newone11_11_interface.Printe;

public class Main {
    public static void main(String[] args) {
        String str = "내가 제일 잘나가";
        Printable pr1 = new PrintDriver2();
        pr1.printrMVK(str);
        Printable pr2 = new PrintDriver();
        pr2.print("출력해 줄 내용");
    }
}
