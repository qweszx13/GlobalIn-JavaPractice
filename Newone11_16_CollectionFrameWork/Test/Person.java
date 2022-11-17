package Newone11_16_CollectionFrameWork.Test;

public class Person {
    String num = "";

    public Person(String num){
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            return num.equals(((Person) obj).num);
        }
            //return num.equals(obj.toString());
        return false;
    }

}
