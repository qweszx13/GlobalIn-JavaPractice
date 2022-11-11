package Newone11_08;

public class Temorary extends Employee {
    int workTime = 0;
    int timePay = 0;
    public Temorary(String name,int age,String address,String position){
        super(name,age,address,position);
        this.timePay = 10000;
    }
    public void setWorkHours(int num){
        this.workTime = num;
    }
    public void printInfo(){
        System.out.println("You is 비정규");
        System.out.println("일한시간:"+workTime);
        System.out.println("월급:"+(workTime*timePay)+"원");
    }
}
