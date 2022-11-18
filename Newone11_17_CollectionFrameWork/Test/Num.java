package Newone11_17_CollectionFrameWork.Test;

import java.util.Objects;

public class Num {
    int num = 0;
    public Num(int i) {
        num = i;
    }

    @Override
    public String toString() {
        return this.num+"";
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
