package Newone11_09;

public class TestMain {
    public static void main(String[] args) {
//        int[][] num = new int[5][3];
//        for(int i=0;i<num.length;i++){
//            for(int j=0;j<num[i].length;j++){
//                num[i][j] = (int)(Math.random()*(90-65))+65;
//                System.out.print((char)num[i][j]);
//            }
//            System.out.println("");
//        }

    TestRegu test = new TestRegu("김동규",27,"인천","레귤러");
    test.Setter(10000000);
    test.printInfo();
    }
}
