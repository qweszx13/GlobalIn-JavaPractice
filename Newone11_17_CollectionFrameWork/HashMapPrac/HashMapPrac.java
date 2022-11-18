package Newone11_17_CollectionFrameWork.HashMapPrac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapPrac {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(45,"Brown");
        map.put(37,"Yello");
        map.put(45,"Greem");

        Set<Integer> sm = map.keySet();

        for(Integer x : sm)
            System.out.print(x.toString()+'\t');
        System.out.println();

        for(Integer x : sm)
            System.out.print(map.get(x)+'\t');
        System.out.println();

        for (Iterator<Integer> itr = sm.iterator();itr.hasNext();)
            System.out.print(map.get(itr.next())+'\t');
        System.out.println();

    }
}
