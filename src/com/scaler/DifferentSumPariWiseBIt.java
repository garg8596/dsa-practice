package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferentSumPariWiseBIt {
    public int cntBits(ArrayList<Integer> A) {
        int n = A.size();
        int ans = 0;
        for(int i=30; i>=0; i--)
        {
            int on = 0;
            int off = 0;
            for(int j=0; j<n; j++)
            {
                if((A.get(j)&(1<<i))>0)on++;
                //if((A.get(j)&(1<<i))>0) sum++;
            }
            off = n-on;
            ans += on*off*2;
            System.out.println(on+ " " + off);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5));
        System.out.println(new DifferentSumPariWiseBIt().cntBits(list));
    }
}
