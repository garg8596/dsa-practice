package com.scaler;

import java.util.Arrays;

public class CountOfDivisor {
    //private static int count(int A){
//        int[] temp = new int[A+1];
//
//        if(A==1) return 1;
//
//        for(int i=0; i<temp.length; i++)
//        {
//            temp[i] = 2;
//        }
//        for(int i=2; i<=temp.length; i++)
//        {
//            for(int j=i*2; j<temp.length; j+=i)
//            {
//                temp[j]++;
//
//            }
//        }
//        return temp[A];
//    }
    public int[] solve(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            max = Math.max(max, A[i]);
        }

        int[] divisor = new int[max+1];

        for(int i=0; i<divisor.length; i++)
        {
            divisor[i] = 2;
        }

        for(int i=2; i<=divisor.length; i++)
        {
            for(int j=2*i; j<divisor.length; j+=i) divisor[j]++;
        }
        //System.out.println(Arrays.toString(divisor));
        int k=0;
        for(int i=0; i<n; i++)
        {
            if(A[i]==1) result[k++] = 1;
            else result[k++] = divisor[A[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        //int[] A = {3, 52, 66, 64, 14, 51, 6, 39, 5, 26, 80, 88, 60, 73, 67, 16, 1, 81, 62, 42, 83, 31, 40, 4, 32, 31, 44, 3, 20, 94, 93, 57, 2, 18, 32, 59, 91, 30, 45};
        int[] A = {2, 3, 4, 5};
        System.out.println(Arrays.toString(new CountOfDivisor().solve(A)));
    }
}

