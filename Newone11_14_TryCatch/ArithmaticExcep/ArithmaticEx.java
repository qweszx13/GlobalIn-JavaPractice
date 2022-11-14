package Newone11_14_TryCatch.ArithmaticExcep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmaticEx {

    //try catch -> 프로그램안죽이려는 목적
    //
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("a/b... a?");
            int n1 = scan.nextInt();
            System.out.println("a/b... b?");
            int n2 = scan.nextInt();
            System.out.printf("%d / %d = %d \n",n1,n2,n1/n2);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("제발 숫자입력점 ㅋ;");
        }finally {//무조건무조건무조건무조건무조건무조건 에러가 있던 없던 무조건무조건무조건
            System.out.println("ByeByeByeBye");
        }
    }
}
