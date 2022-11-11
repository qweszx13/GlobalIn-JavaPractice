package Newone11_08;

public class ColorTV extends TV {
    private int color = 0;

    public ColorTV(int color,int inch){
        super(inch);
        this.color = color;
    }
    public void printProperty() {
        System.out.println(super.getSize()+"인치"+color+"컬러");
    }
}
