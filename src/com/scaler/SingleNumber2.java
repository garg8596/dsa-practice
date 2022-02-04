package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber2 {
    public int singleNumber(final ArrayList<Integer> A) {
        int n = A.size();
        int ans = 0;
        for(int i=0; i<31; i++)
        {
            int sum = 0;
            for(int j=0; j<n; j++)
            {
                if((A.get(j)&(1<<i))>0) sum++;
            }
            sum = sum%3;
            ans |=(sum<<i);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 3, 3, 2, 2, 3, 1, 1));
        System.out.println(new SingleNumber2().singleNumber(list));
    }
}
