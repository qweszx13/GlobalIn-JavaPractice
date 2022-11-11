package Newone11_05;

public class Everage {
    int math;
    int science;
    int english;

    public Everage(int math,int science,int english){
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public double evg(){
        double result = (math+science+english)/3;
        return result;
    }

}
