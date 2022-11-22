package Newone11_21_Network.Test;

public class TestMain {
    public static void main(String args[]) {
        ThreadMovie tmovie = new ThreadMovie();
        ThreadMusic tmusic = new ThreadMusic();

        tmovie.start();
        tmusic.start();

    }
}
