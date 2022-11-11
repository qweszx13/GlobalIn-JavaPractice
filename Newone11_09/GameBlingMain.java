package Newone11_09;

import java.util.Scanner;

public class GameBlingMain {
    public static void main(String[] args) {
        int playerNum = 0;
        int count = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("몇명 돌릴래?");
        playerNum = scan.nextInt();//큐에 남아있는 수를 Enter나 공백기준으로 나누기에 큐에 공백이 남게됨/
        scan.nextLine();//비워주셈 제발
        System.out.println(playerNum+"명 셋팅");
        GameBlingPlayer[] gp = new GameBlingPlayer[playerNum];

        for(int i=0;i<playerNum;i++){
            System.out.print("참가자 이름 입력");
            String playerName = scan.nextLine();
            gp[i] = new GameBlingPlayer(playerName);
        }
        System.out.println("참가자 등록완료 게임시작 press Enter");
        scan.nextLine();
        int arrayNum = 0;
        while (true){
            if(arrayNum == playerNum){
                arrayNum = 0;
                continue;
            }else{
                gp[arrayNum].gameStart();
                if(gp[arrayNum].result == true)
                    break;
            }
        }

    }
}
