package Newone11_17_CollectionFrameWork.Test;

import java.util.HashSet;
import java.util.Set;

public class Test3 {
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
}
