package Newone11_17_CollectionFrameWork.Test;

import java.util.Objects;

public class Person {
    String name = "";
    public Person(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Person){
            if (this.name.equals(((Person) o).name)) return true;
        }
        return false;
    }
}
