package Newone11_09;

public class TestRegu extends TestEmp{

    public TestRegu(String name,int age,String address,String position){
        super(name,age,address,position);
    }
    public void Setter(int num){
        super.money = num;
    }
    public void printInfo(){
        System.out.println("정규직");
        System.out.println(super.name+"님 월급"+super.money+"원");
    }

}
