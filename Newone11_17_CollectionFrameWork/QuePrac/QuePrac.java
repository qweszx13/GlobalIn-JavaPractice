package Newone11_17_CollectionFrameWork.QuePrac;

import java.util.LinkedList;
import java.util.Queue;

public class QuePrac {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        que.offer("Box");
        que.offer("Toy");
        que.offer("Robot");

        System.out.println("Next: "+que.peek());

        System.out.println(que.poll());
        System.out.println(que.poll());

        System.out.println("Next: "+que.peek());

        System.out.println(que.poll());

    }
}
