package Newone11_10;

public class Temporary extends Employee {

    public Temporary(String name, int num, String address, String position) {
        super(name,num,address,position);

    }


    public void setWorkHours(int i) {
        super.salary=i;
    }

    public void printInfo() {
        System.out.println("비정규직");
        System.out.println(super.salary+"만큼일하셔서"+super.salary*10000+"원버셨네요");
    }
}
