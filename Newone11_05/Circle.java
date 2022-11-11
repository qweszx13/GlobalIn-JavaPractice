package Newone11_05;

public class Circle {
    int num = 0;
    public Circle(int num){
        this.num = num;
    }

    public double getArea(){
        return this.num*this.num*Math.PI;
    }
}
