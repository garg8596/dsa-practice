package com.scaler;

/*
good question - medium
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.*;

public class MissingNumber {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> temp = new ArrayList<>();
        int xor = 0;
        int len = A.size();
        for(int i=0; i<len; i++)
        {
            xor ^= A.get(i);
        }
        for(int i=1; i<=len; i++)
        {
            xor ^= i;
        }
        int a=0, b=0;
        int rbsm = xor &-xor;
        for(int val:A)
        {
            if((val & rbsm) == 0) a^=val;
            else b^=val;
        }
        for(int i=1; i<=len; i++)
        {
            if((i & rbsm) == 0) a^=i;
            else b^=i;
        }
        for(int val:A)
        {
            if(val == a)
            {
                temp.add(a);
                temp.add(b);
                break;
            }
        }
        for(int val:A)
        {
            if(val == b)
            {
                temp.add(b);
                temp.add(a);
                break;
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(3, 1, 2, 5, 4, 5));
        System.out.println(new MissingNumber().repeatedNumber(res));
    }
}
