package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DutchNationalFlag {
    public ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int len = A.size();
        int max = Collections.max(A);
        int[] temp = new int[3];

//        for(int i=0; i<10; i++)
//        {
//            temp[i] =  0;
//        }

        for(int i=0; i<len; i++)
        {
            int val = A.get(i);
            temp[val] = temp[val]+1;
        }

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<temp[i]; j++)
            {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 1 ,2, 1, 0));
        System.out.println(new DutchNationalFlag().sortColors(A));
    }
}
