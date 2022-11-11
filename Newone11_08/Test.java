package Newone11_08;

public class Test {
    public static void main(String[] args) {
        int[][] num = new int[4][4];
        int count = 1;
        for(int i=0;i< num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j] += count;
                System.out.println(num[i][j]);
                count++;
            }
        }
    }
}
