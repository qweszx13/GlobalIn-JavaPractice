package Newone11_15_Math_Array.Equals_Method;

import java.util.Objects;

public class INum {
    private int num;
    public INum(int num){
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof INum){
            if (this.num == ((INum)o).num) return true;
        }
        return false;
    }

}
