package Newone11_15_Generic.Test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
//    public static void main(String[] args) {

//        main 에서 아래를 넣고 돌아가도록 하시오.       출력 : true
//
//        INum iNum1 = new INum(3);
//        INum iNum2 = new INum(3);
//
//        System.out.println(iNum1.equals(iNum2));
//
//        StringTokenizer st1 = new StringTokenizer("PM:08:45", ":");
//        while(st1.hasMoreTokens()){
//            System.out.print(st1.nextToken()+" ");
//        }
//    }
//            아래와 같이 출력 되도록 위의 코드를 완성 하시오.
//            출력:  PM  08  45

//        public static void main (String[]args){
//            Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
//            for(Fruit f : fAry)
//                f.print();
//
////            - 결과
////            나는 포도이다.
////            나는 사과이다.
////            나는 배이다.
//        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두정수를 입력 ㄱ");
        String num = scan.nextLine();
        String[] newNum = num.split(" ");
        int num1 = 0;
        int num2 = 0;
        Calc calculate = null;
        for(int i=0;i<newNum.length;i++){
            if(i==0)
                num1 = Integer.parseInt(newNum[0]);
            else if(i==1)
                num2 = Integer.parseInt(newNum[1]);
            else if(i==2){
                System.out.println(newNum[i]);
                switch (newNum[i]){
                    case "+":
                        calculate = new Sum();
                        break;
                    case "-":
                        calculate = new Min();
                        break;
                    case "*":
                        calculate = new Mul();
                        break;
                    case "/":
                        calculate = new Div();
                        break;
                }
            }else{
                System.out.println("???????");
            }

        }

        calculate.setValue(num1,num2);
        System.out.println(calculate.calculate());
    }


}
