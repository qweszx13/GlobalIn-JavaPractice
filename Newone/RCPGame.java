package Newone;

import java.util.Random;

public class RCPGame {
    int user = -1;
    int com = 0;

    public RCPGame(String num){



        Random rand = new Random();
        com = rand.nextInt(3);
        setUser(num);



    }
    public void setUser(String num){
        if(num.equals("가위")) user = 0;
        else if(num.equals("바위")) user = 1;
        else if(num.equals("보")) user = 2;
        else {
            System.out.println("뭐하셈?");
            System.exit(0);
        }

        System.out.println("님은=>"+resultString(user));
        System.out.println("컴터는=>"+resultString(com));
        fight();

    }
    public String resultString(int num){
        if(num == 0)
            return "가위";
        else if(num == 1)
            return "바위";
        else if(num == 2)
            return "보";
        else{
            System.out.println("잘못입력하신듯 ㅋ ㅅㄱ");
            System.exit(0);
        }
        return "어케왔누";
    }
    public void fight(){
        if(user==com)
            System.out.println("비김");
        else if((user==0&&com==1)||(user==1&&com==2)&&(user==2||com==0))
            System.out.println("님이 짐");
        else if((user==0&&com==2)||(user==1&&com==0)||(user==2&&com==1))
            System.out.println("님이 이김");
        else{
            System.out.println("야매로");
            System.exit(0);
        }
    }
}
