package Newone11_17_CollectionFrameWork.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPrac2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int max = 0;
        String key = "";
        for(int i=0;i<5;i++){
            try{
                System.out.println("나라 이름, 인구 >>");
                String[] num = scan.nextLine().split(",");
                if(max < Integer.parseInt(num[1])){
                    max = Integer.parseInt(num[1]);
                    key = num[0];
                }
                map.put(num[0],Integer.parseInt(num[1]));
            }catch (Exception e){
                System.out.println("제대로 입력하셈");
                i--;
                continue;
            }
        }
        System.out.println("가장 인구가 많은 나라는 "+key+","+map.get(key));
    }
}
