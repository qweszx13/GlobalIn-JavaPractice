package Newone11_07;

public class BoxArray {
    public static void main(String[] args) {
        int[] arrLotto = makeLotto();

        for(int num : arrLotto){
            System.out.println(num);
        }
    }

    public static int[] makeLotto(){
        int[] result = new int[6];
        for(int i=0;i<result.length;i++){
            result[i] = (int)(Math.random()*46+1);
            int count = 0;
            while(true){
                if( i == count)
                    break;

                if(result[i] != result[count]) {
                    count++;
                    continue;
                }
                else if(result[i] == result[count]){
                    count = 0;
                    result[i] = (int)(Math.random()*46+1);
                }
            }
        }


        return result;
    }
}
