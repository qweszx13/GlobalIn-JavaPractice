public class FishBreadMakeClass {
    String Fish = "";

    FishBreadMakeClass(){
        this.Fish += "";
    }
    FishBreadMakeClass(String sauceName){
        this.Fish += sauceName+"맛붕어빵";
    }
    public void giveClient(int breadCount){
        if(Fish.isEmpty())
            System.out.println("붕어빵이 없어서 못팔아유");
        else
            System.out.println(this.Fish+breadCount+"개 나가유~");
    }
}
