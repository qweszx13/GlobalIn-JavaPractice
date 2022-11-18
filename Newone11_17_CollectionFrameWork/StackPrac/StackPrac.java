package Newone11_17_CollectionFrameWork.StackPrac;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackPrac {
    //stack 문제가 존재해서 잘사용하지않음
    //대신 Deque를 기준으로 스택을 구현하는 것이 국룰이다.
    //Deque? 양방향 으로 입력 출력 가능한 Que
    //Deque에서 Last 부분을 사용하지않으면 그냥 stack과 똑같다.
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        //Deque<E>,List<E>,Queue<E> = > LinkedList<E>가 구현하는 인터페이스들

        dq.offerFirst("1.Box");
        dq.offerFirst("2.Toy");
        dq.offerFirst("3.Robot");

//        dq.offerLast("1.Box");
//        dq.offerLast("2.Toy");
//        dq.offerLast("3.Robot");

//        System.out.println(dq.pollLast());
//        System.out.println(dq.pollLast());
//        System.out.println(dq.pollLast());

        System.out.println(dq.pollFirst());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollFirst());


    }
}
