package com.scaler;

public class OddEvenSubsequences {
    public int solve(int[] A) {
        int len = A.length;
        int count2 = 0;
        int count1 = 0;
        int val = 1;
        for(int i=0; i<len; i++)
        {
            if(val%2==1)
            {
                if(A[i]%2==0)
                {
                    count1++;
                    val = A[i];
                }
            }
            else
            {
                if(A[i]%2==1)
                {
                    count1++;
                    val = A[i];
                }
            }

        }
        val = 0;
        for(int i=0; i<len; i++)
        {
            if(val%2==0)
            {
                if(A[i]%2==1)
                {
                    count2++;
                    val = A[i];
                }
            }
            else
            {
                if(A[i]%2==0)
                {
                    count2++;
                    val = A[i];
                }
            }

        }
        return Math.max(count1, count2);
    }

    public static void main(String[] args) {
        //int[] A = {12, 10, 28, 37, 43, 40, 14, 12, 48};
        int[] A = {1, 2, 2, 5, 6};
        System.out.println(new OddEvenSubsequences().solve(A));
    }
}
