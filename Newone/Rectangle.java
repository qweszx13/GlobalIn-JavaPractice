package Newone;

public class Rectangle {
    private  int x,y,width,height;

    public Rectangle(int x,int y,int width,int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void show() {
        System.out.println("("+ x + ","+ y +")에서 크기가 "+ width +"x" + height + "인 사각형");
    }
    public int square(){
        int result = this.width*this.height;
        return result;
    }
    public boolean contains(Rectangle r){
        boolean result = false;
        if((this.x<r.x)&&(this.x+this.width>r.x+r.width)&&(this.y<r.y)&&(this.y+this.height>r.y+r.height))
            result = true;
        return result;
    }
}
