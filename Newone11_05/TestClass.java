package Newone11_05;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        SongJava song = new SongJava("Dancing Queen","ABBA",1978,"스웨덴");
        song.show();
        Hap2 hap = new Hap2(100);
        System.out.println(hap.result());
        TE tv = new TE("LG",1996,24);
        tv.show();
        Gugudan gudan = new Gugudan(20);
        Scanner scan = new Scanner(System.in);
        System.out.println("값 수 과 영 입력");
        int math = scan.nextInt();
        int science = scan.nextInt();
        int english = scan.nextInt();

        Everage ev =  new Everage(math,science,english);
        System.out.println(ev.evg()+"점 이심 ㅇㅇ");
    }
}