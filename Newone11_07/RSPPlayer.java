package Newone11_07;

public class RSPPlayer {
    public int setPlayer = 0;
    public int comPlayer = (int)(Math.random()*3+1);
    public RSPPlayer(String rsp) {
        int num = rsp.equals("가위")?1:rsp.equals("바위")?2:rsp.equals("보")?3:1000;
        setPlayer = num;
        }

    public int result() {
        return setPlayer;
    }
}

