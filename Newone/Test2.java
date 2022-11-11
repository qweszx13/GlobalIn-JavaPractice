package Newone;

import java.util.Scanner;

//사용자에게 받은 문자열을 역순으로 화면에 출력하는 프로그램을 작성하시오.
//        힌트:String 객체의 charAt 함수를 활용
//        입력:abcde
//        출력:edcba
public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("영어 입력 ㄱ");
        String num = scan.nextLine();
        String result = "";
        int count = num.length()-1;

        for(int i=0;i<num.length();i++){
            char input = num.toCharArray()[count];
            result += input;
            count--;
        }
        System.out.println(result);

    }
}
