package Newone11_11_interface.Test;

public class newCircle {
    int i = 0;
    public newCircle(int i) {
        this.i = i*i;
    }

    @Override
    public String toString() {
        return "넓이는 "+this.i+"입니다";
    }
}
