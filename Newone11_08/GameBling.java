package Newone11_08;

import java.util.Scanner;

public class GameBling {
    String name = "";
    boolean status = false;
    public GameBling(String name){
        this.name = name;
    }

    public void gameStart(){
        System.out.print("["+name+"] 님 턴");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        int[] num = new int[3];
        for(int i=0;i<num.length;i++){
            num[i] =(int)(Math.random()*3+1);
            System.out.print(num[i]+" ");
        }
        if(num[0]==num[1]&&num[0]==num[2])
            this.status = true;
        else
            System.out.println("ジャンねん");
    }
}
