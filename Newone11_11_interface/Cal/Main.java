package Newone11_11_interface.Cal;

public class Main {
    public static void main(String[] args) {
        ICalculator cal = new Calculator();

        System.out.println(cal.add(10,5));
        System.out.println(cal.sub(10,5));
        System.out.println(cal.multi(10,5));
        System.out.println(cal.div(10,5));

        char ch  = 'M';

        if(Person.FEMAIL == ch )
            System.out.println("응 여자야");
        else
            System.out.println("응 남자야");


    }
}
