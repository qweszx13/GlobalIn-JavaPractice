package Newone11_15_Generic.Test;

import java.util.Objects;

public class INum {
    int num;
    public INum(int i) {
        this.num = i;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof INum){
            if (this.num == ((INum)o).num) return true;
        }
        return false;
    }

}
