package Newone11_21_Network.Test;

import java.io.*;
import java.util.Scanner;

public class IOStreamTestMain {
    public static void main(String[] args) {
//        5. IO 스트림을 이용하여 아래와 같이 프로그램을 완성하시오.
//                =================
//        대상 파일: a.java
//        사본 이름: x:\b.java
        Scanner scan = new Scanner(System.in);
        System.out.print("대상 파일: ");
        String fileName = scan.nextLine();
        System.out.print("사본 이름: ");
        String copyName = scan.nextLine();

        try(BufferedInputStream bi = new BufferedInputStream(new FileInputStream(fileName));
            BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(copyName))
        ){
            int data;
            while(true) {
                data = bi.read();
                if(data == -1)
                    break;
                bo.write(data);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
