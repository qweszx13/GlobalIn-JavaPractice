package Newone;

public class Box {
    int num = 0;
    String title = "";

    Box(int num,String title){
        this.num = num;
        this.title = title;
    }

    public int getBoxNum(){
        return this.num;
    }
    public String toString(){
        return this.title;
    }
}
