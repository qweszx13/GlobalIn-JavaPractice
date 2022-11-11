package Newone11_09;

public class TestEmp {
    String name;
    int age;
    String address;
    String position;
    int money;

    public TestEmp(String name ,int age, String address, String position){
        this.name = name;
        this.age = age;
        this.address = address;
        this.position = position;
    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(position);

    }

}
