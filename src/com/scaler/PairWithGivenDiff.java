package com.scaler;

import java.util.Arrays;

public class PairWithGivenDiff {
    public int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;
        Arrays.sort(A);
        int i=0;
        int j = i+1;
        System.out.println(Arrays.toString(A));
        while(j!=n)
        {
            if(Math.abs(A[i]-A[j])==B && i!=j)
            {
                count++;
                if(i < n) i++;
                if(j < n-1) j++;
                System.out.println(i + " " + j + " " + count);
                while(A[i]==A[i-1] && i > 0 && i< n-1)
                {
                    i++;
                }
                while(A[j]==A[j-1] && j < n-1 )
                {
                    j++;
                }
            }
            else if(Math.abs(A[i]-A[j])>B)
            {
                i++;
                if(i==j) j++;
            }
            else j++;
        }
        return count;
    }

    public static void main(String[] args) {
        //int[] arr = {8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3 };
        //int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(new PairWithGivenDiff().solve(arr, 1));
    }
}
