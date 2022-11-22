package Newone11_21_Network.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
//        1.  아래를 작성 하시오.프로그래밍
//        나라 이름과 인구를 입력하세요.(예: Korea 5000)
//        나라 이름, 인구 >> Korea 5000
//        나라 이름, 인구 >> USA 1000000
//        나라 이름, 인구 >> Swiss 2000
//        나라 이름, 인구 >> France 3000
//        나라 이름, 인구 >> 그만
//
//        인구 검색 >> France
//        France의 인구는 3000
//        인구 검색 >> 스위스
//        스위스 나라는 없습니다.
//                인구 검색 >> 그만
        Map<String,Integer> myMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String[] myArray;
        System.out.println("나라 이름과 인구를 입력하세요.(예 : Korea 5000)");
        while(true){
            myArray = scan.nextLine().split(" ");
            if(myArray.length != 2 ||myArray[0].equals("그만")) break;
            myMap.put(myArray[0],Integer.parseInt(myArray[1]));
        }

        while(true){
            System.out.print("인구 검색 >>");
            String search = scan.nextLine();
            if(search.equals("그만")) break;
            try{
                System.out.println(search +"의 인구는"+myMap.get(search));
            }catch (Exception e){
                System.out.println(search+"의 인구는 없슴다");
            }
        }


    }
}
