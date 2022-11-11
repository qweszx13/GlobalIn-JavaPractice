package Newone11_09;

public class GameBlingPlayer {
    String name = "";
    boolean result = false;

    public GameBlingPlayer(String name){
        this.name = name;
    }

    public void gameStart(){
        int[] num = new int[3];
        for(int i=0;i<num.length;i++){
            num[i] = (int)(Math.random()*3+1);
            System.out.print(num[i]+" ");
        }
        if(num[0]==num[1]&&num[1]==num[2]){
            System.out.print(name+"님이 이겼습니다.");
            this.result = true;
        }else{
            System.out.println("까비");
            this.result = false;
        }

    }


}
