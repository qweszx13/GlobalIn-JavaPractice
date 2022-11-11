package Newone11_08;

import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.println("열행 넣으셈 1~10 만 가능");

       int row = 0;
       int col = 0;
       while(true){
           row = scan.nextInt();
           col = scan.nextInt();
           if((row>=1&&row<=10)&&(col>=1&&col<=10))
               break;
           else{
               System.out.println("값 제대로좀 입력하셈");
               continue;
           }
       }

       int[][] arr = new int[row][col];
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               arr[i][j] = (int)(Math.random()*26+65);
               System.out.print((char)arr[i][j]);
           }
           System.out.println("");
       }



    }
}
