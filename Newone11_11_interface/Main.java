package Newone11_11_interface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calc calc = null;

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int count = 0;
        String[] array = num.split(" ");
        ArrayList list = new ArrayList();
        String result = "";
        for(String x : array){
            if(x.matches("-?\\d+(\\.\\d+)?")){
                list.add(Integer.parseInt(x));
            }else
                result = x;
        }

        switch (result){
            case "+" : calc = new Add();
            break;
            case "-" : calc = new Min();
            break;
            case "/" : calc = new Div();
            break;
            case "*" : calc = new Mul();
            break;
            default:
                System.out.println("값입력이 다릅니당!");
        }





    }
}
