package Newone11_21_Network.Test;

public class ThreadMusic extends Thread{
    @Override
    public void run() {
        for(int i=0; i < 500; i++)
            System.out.printf("%s", new String("음악"));

    }
}
