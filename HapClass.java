public class HapClass {
    int sum = 0;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public HapClass(int num){
        for(int i=1;i<num+1;i++){
            this.sum += i;
        }
    }

    public int result(){
        return this.sum;
    }
}
