package com.scaler;

import java.util.Arrays;

public class DistinctPrime {
    public int solve(int[] A) {
        int n = A.length;
        int max = A[0];
        int count=0;
        for(int i=1; i<n; i++)
        {
            if(max < A[i]) max = A[i];
        }
        System.out.println(max);
        boolean[] temp = new boolean[max+1];
        for(int i=0; i<temp.length; i++) temp[i] = true;

        for(int i=2; i*i<=temp.length; i++)
        {
            if(temp[i])
            {
                for(int j=i*i; j<temp.length; j+=i) temp[j]=false;
            }
        }
        System.out.println(Arrays.toString(temp));
        for(int i=1; i<temp.length; i++)
        {
            if(temp[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {96, 98, 5, 41, 80};
        System.out.println(new DistinctPrime().solve(A));
    }
}
