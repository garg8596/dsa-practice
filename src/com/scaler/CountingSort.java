package com.scaler;

import java.util.Arrays;

public class CountingSort {
    public  int[] solve(int[] A) {
        int len = A.length;

        int max = Integer.MIN_VALUE;

        for(int i=0; i<len; i++)
        {
            if(max < A[i]) max = A[i];
        }

        int[] ans = new int[len];
        int[] sorted = new int[max+1];

        //for(int i=0; i<=max; i++) sorted[i] = 0;

        for(int i=0; i<len; i++)
        {
            int val = A[i];
            sorted[val] = sorted[val]+1;
        }
        for(int i=1; i<=max; i++) sorted[i] = sorted[i]+sorted[i-1];


        //Important
        for(int i=len-1; i>=0; i--)
        {
            ans[sorted[A[i]]-1] = A[i];
            sorted[A[i]] = sorted[A[i]]-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 3, 0, 2, 3, 0, 3};
        System.out.println(Arrays.toString(new CountingSort().solve(A)));
    }
}
