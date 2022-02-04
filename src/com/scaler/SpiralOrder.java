package com.scaler;

import java.util.Arrays;
/*
https://www.youtube.com/watch?v=siKFOI8PNKM
 */

public class SpiralOrder {
    public int[] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[] res = new int[rows*cols];
        int i=0, j=0, x=0;

        while(rows>1 && cols>1)
        {
            for(int k=1; k<=cols-1; k++, j++)
            {
                res[x++] = A[i][j];
            }
            for(int k=1; k<=rows-1; k++, i++)
            {
                res[x++] = A[i][j];
            }
            for(int k=1; k<=cols-1; k++, j--)
            {
                res[x++] = A[i][j];
            }
            for(int k=1; k<=rows-1; k++, i--)
            {
                res[x++] = A[i][j];
            }
            rows = rows-2;
            cols-=2;
            i++; j++;
        }
        if(rows==1 || cols==1)
        {
            if(rows>1)
            {
                for(int k=1; k<=rows; k++, i++) res[x++] = A[i][j];
            }
            else
            {
                for(int k=1; k<=cols; k++, j++) res[x++] = A[i][j];
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int A[][] = {{1, 2, 3 }};
        System.out.println(Arrays.toString(new SpiralOrder().solve(A)));
    }
}
