package Newone11_16_CollectionFrameWork.LinkedList;

import java.util.*;

public class LinkedListPrac {
    public static void main(String[] args) {

        MyLinkedList list1 = new MyLinkedList();
        list1.i = 1;

        MyLinkedList list2 = new MyLinkedList();
        list2.i = 2;

        list1.myLinkedList = list2;

        List<String> list = new LinkedList<>();

        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i) + '\t');
        }
        System.out.println();

        list.remove(0);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i) + '\t');
        }
        System.out.println();

        for(String x : list){
            System.out.print(x+" ");
        }
    }
}
