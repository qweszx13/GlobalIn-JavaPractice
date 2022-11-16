package Newone11_15_Generic.GenericPrac;

import java.util.ArrayList;

public class GenericStack <T>{
    public int pointer = 0;
    public static Object[] stack;

//    public T peek(){
//
//    }

    public void clear(){

    }

    public void isEmpty(){
        for(int i=0;i<stack.length;i++){
            stack[i] = null;
        }
    }

    public void push(T num){
        stack[pointer] = num;
        pointer++;
    }


    public T pop(){
        T popnum = (T)stack[pointer];
        stack = remove(stack);
        pointer--;
        System.out.println("pointer"+pointer);
        System.out.println("stack"+stack);
        return popnum;
    }

    private Object[] remove(Object[] array){
        if(array.length == 0) return array;
        Object[] newArray = null;
        for(int i=0;i< array.length-1;i++){
            newArray[i] = array[i];
        }
        return newArray;
    }


}
