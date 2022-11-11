package Newone11_10_Polymolphism;

public class TestEmploy {
    public static void main(String[] args) {
        Temporary t = new Temporary("장보고", 25, "인천", "경리부");

        t.setWorkHours(120);
        t.printInfo();
    }

}
