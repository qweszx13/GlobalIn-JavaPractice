package Newone11_08;

public class Employee {
    private String name = "";
    private int age = 0;
    private String address = "";
    String position = "";
    int money = 0;

    public Employee(String name,int age,String address,String position){
        this.name = name;
        this.age = age;
        this.address = address;
        this.position = position;
    }
    
    public void printInfo(){
        System.out.println("이름"+name+"나이"+age+"주소"+address+"직무"+position+"월급"+money);
    }
}
