package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddOneTo {
    public ArrayList<Integer> plusOne(ArrayList<Integer>A) {
        ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        int i = A.size()-1;

        while(i>=0)
        {
            if(i==A.size()-1)
            {
                count+=A.get(i)+1;
                res.add(count%10);
            }
            else
            {
                count+=A.get(i);
                res.add(count%10);
            }
            count/=10;
            i--;
        }
        if(count!=0) res.add(count);
        Collections.reverse(res);
        int x = 0;
        while(x < res.size() && res.get(x)==0)
        {
            res.remove(x);
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 9));
        System.out.println(new AddOneTo().plusOne(A));
    }
}
