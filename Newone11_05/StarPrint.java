package Newone11_05;

public class StarPrint {
    int starLine = 0;
    public StarPrint(int num){
        this.starLine = num;
    }
    public void getPrint(){
        for(int i=0;i<this.starLine;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void getPrint(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
