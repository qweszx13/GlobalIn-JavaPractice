package Newone11_05;

public class Hap2 {
    int sum = 0;
    public Hap2(int num){
        for(int i=0;i<=num;i++){
            this.sum+=i;
        }
    }

    public int result(){
        return this.sum;
    }
}
