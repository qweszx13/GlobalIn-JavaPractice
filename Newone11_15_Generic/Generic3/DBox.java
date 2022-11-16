package Newone11_15_Generic.Generic3;
class Main{
    public static void main(String[] args) {
        DBox<String,Integer> db1 = new DBox<>();
        DBox<Integer,String> db2 = new DBox<>();

        db1.set("Apple",25);
        db2.set(20,"Banana");

        System.out.println(db1);
        System.out.println(db2);
    }
}

public class DBox<L,R>{
    protected L left;
    protected R right;

    public void set(L l,R r){
        this.left = l;
        this.right = r;
    }

    @Override
    public String toString() {
        return left+"&"+right;
    }
}
