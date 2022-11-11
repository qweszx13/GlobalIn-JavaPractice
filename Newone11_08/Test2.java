package Newone11_08;

public class Test2 extends TV {
    int color = 0;
    public Test2(int num,int color){
        super(num);
        this.color = color;
    }

    public void printProperty() {
        System.out.println(this.getSize()+"인치"+this.color+"색");
    }
}
