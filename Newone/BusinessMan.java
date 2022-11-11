package Newone;

class Man {
    private String name;

    public Man(String name) {
       this.name = name;
    }

    public void tellYourName() {
        System.out.println("My name is " + name);
    }
}
//this 생성
class BusinessMan extends Man {
    String company;
    String position;


    public BusinessMan(String name, String company, String position) {
        super(name);
        this.company = company;
        this.position = position;
    }

    /*
     * public BusinessMan(String name, String company, String position) { this.name
     * = name; this.company = company; this.position = position;
     *
     * }
     */

    public void tellYourInfo() {
        System.out.println("My company is " + this.company);
        System.out.println("My position is " + this.position);
        tellYourName();
    }
}


class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man
                = new BusinessMan("Yoon","Hybrid ELD", "Staff Eng.");


        man.tellYourInfo();

    }
}