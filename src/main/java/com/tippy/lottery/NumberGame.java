package com.tippy.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    int numCount;
    Set<Integer> number = new HashSet<>();
    public abstract void generate();
    public boolean validate(){
        if (number.size() == numCount){
            return true ;
        }
        else{
            return false;
        }
    }
}
