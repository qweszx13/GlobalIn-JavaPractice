package Newone11_17_CollectionFrameWork.Test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
//        Question 5.
//
//        5개 나라 이름과 인구를 입력받아 해시맵에 저장하고,
//                가장 인구가 많은 나라를 검색하여 출력하는 프로그램을 작성하라.
//                이때 다음 해시맵을 이용하라.
//
//                System.out.println("나라 이름과 인구를 5개 입력하세요.");
        HashMap<String,Integer> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("나라 이름과,인구 다개 입력 ㄱ");
        for(int i=0;i<5;i++){
            try{
                String[] num = scan.nextLine().split(",");
                map.put(num[1],Integer.parseInt(num[2]));
            }catch (Exception e){
                System.out.println("your num is wrong");
                --i;
            }
        }
        Set<String> sm = map.keySet();

        int max = 0;
        String country = "";

        for(String x : sm){
            if(max<map.get(x)){
                max = map.get(x);
                country = x;
            }
        }

        System.out.println(country+"나라"+max+"명 이제일 많음");


    }
}
