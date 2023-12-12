package org.example;

import java.util.Objects;

public class Simple {
    private int i;
    private String text;
    public Simple(int j,String t){
        i=j;
        text=t;
    }



    @Override
    public String toString(){
        return String.format("Simple(%d,%ss)",i,text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Simple simple = (Simple) o;
        return i == simple.i && Objects.equals(text, simple.text);
    }

    @Override
    public int hashCode() {
        return 7*Objects.hashCode( text) + 73 * i;
    }
}
