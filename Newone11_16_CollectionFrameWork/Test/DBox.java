package Newone11_16_CollectionFrameWork.Test;

public class DBox<T, T1> {
    private T age;
    private T1 name;

    public void set(T age,T1 name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name+"살"+age;
    }
}
