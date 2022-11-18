package Newone11_17_CollectionFrameWork.Test;

import java.util.HashSet;

public class Test4 {
    public static void main(String[] args) {
       // 출력이 아래와 같이 나오도록 하시오(필수) ⭐️
        HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("인스턴스 수: " + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();

/*
====출력
인스턴스 수: 2
7799        9955
*/
    }
}
