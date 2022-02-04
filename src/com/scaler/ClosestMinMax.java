package com.scaler;

import java.util.*;

public class ClosestMinMax {
    public int solve(ArrayList<Integer> A) {
        int len = A.size();
        int max_index = 2*len;
        int min_index = 2*len;
        int ans = len;

        int min_value = Collections.min(A);
        int max_value = Collections.max(A);

        System.out.println("Min: "+min_value + " Max: " + max_value);

        for(int i=len-1; i>=0; --i)
        {
            if(max_value == A.get(i))
            {
                ans = Math.min(ans, min_index-i+1);
                max_index = i;
            }
            if(min_value == A.get(i))
            {
                ans = Math.min(ans, max_index-i+1);
                min_index = i;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(814, 761, 483, 697, 981));
        ClosestMinMax cmm = new ClosestMinMax();
        int size = cmm.solve(res);
        System.out.println("Smallest SubArray Size = " + size);
    }
}
