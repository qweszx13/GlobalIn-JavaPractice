package Newone11_17_CollectionFrameWork.Test;

import java.util.*;

public class HashMapPrac1 {
    public static void main(String[] args) {

//        HashMap<String, Integer> 컬렉션을
//        생성하고 “에스프레소”는 2000,
//        “아메리카노”는 2500,
//        “카푸치노”는 3000,
//        “카페라테”는 3500을 저장하라.
//        그리고 다음과 같이 음료수 이름을 입력받으면 HashMap에서 검색하여 가격을 출력하라.

        Map<String, Integer[]> map = new HashMap<>();


        map.put("에스프레소",status(2000,0));
        map.put("아메리카노",status(3000,0));
        map.put("카푸치노",status(4000,0));
        map.put("카페라테",status(2500,0));
        map.put("펩시",status(1200,0));

        System.out.println("오늘의 메뉴 : 에스프레소,아메리카노,카푸치노,카페라테,펩시 Choose");
        Scanner scan =  new Scanner(System.in);
        int sum = 0;

        while(true){
            try{
                String num = scan.nextLine();
                System.out.println(num+"하나");
                sum += map.get(num)[0];
                map.get(num)[1] ++;
                System.out.println("주문 계속하실? Y/N");
                if(scan.nextLine().toUpperCase().equals("Y"))
                    continue;
                else
                    break;
            }catch (Exception e){
                System.out.println("메뉴를 제대로 말해주세요^^");
                continue;
            }
        }
        Set<String> ks = map.keySet();

        for(String x : ks){
            if(map.get(x)[1] != 0){
                System.out.println(x+" "+map.get(x)[1]+"잔");
            }
        }
        System.out.println("총 요금 :"+sum+"임ㅇㅇ");

    }
    public static Integer[] status(int price,int num){
        Integer[] result = new Integer[2];
        result[0] = price;
        result[1] = num;
        return result;
    }
}
