package Newone11_08;

public class Main {
    public static void main(String[] args) {
        GameBling g1 = new GameBling("수희");
        GameBling g2 = new GameBling("난희");

        while(true){
            g1.gameStart();
            if(g1.status == true){
                System.out.println(g1.name+"님의 승리");
                break;
            }

            g2.gameStart();
            if(g1.status == true){
                System.out.println(g2.name+"님의 승리");
                break;
            }

        }
    }
}
