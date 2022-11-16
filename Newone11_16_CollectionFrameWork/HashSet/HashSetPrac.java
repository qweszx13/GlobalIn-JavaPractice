package Newone11_16_CollectionFrameWork.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetPrac {
    public static void main(String[] args) {
        Set<Integer> lottoSet = new HashSet<>();

        while(lottoSet.size() != 6){
            int num = (int)(Math.random()*46+1);
            lottoSet.add(num);
        }
        for(int num : lottoSet){
            System.out.println(num);
        }
    }

//    @Override hashset의 같은 object 판단 기준은?-> hashcode,equals 사용
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
}
