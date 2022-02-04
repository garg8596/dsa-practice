package com.scaler;

/*
try again
 */

import java.util.Arrays;

public class SpiralOrder2 {
    public int[][] generateMatrix(int A){
        int[] temp = new int[A*A];
        int[][] res = new int[A][A];
        for(int i=0; i<A*A; i++)
        {
            temp[i] = i+1;
        }
        System.out.println();
        int i=0, j=0, x=0;
        while(A>1)
        {
            for(int k=0; k<A-1; k++, j++)
            {
                res[i][j] = temp[x++];
            }
            System.out.println("i: " + i + " j: " + j);
            for(int k=0; k<A-1; k++, i++)
            {
                res[i][j] = temp[x++];
            }
            System.out.println("i: " + i + " j: " + j);
            for(int k=0; k<A-1; k++, j--)
            {
                res[i][j] = temp[x++];
            }
            System.out.println("i: " + i + " j: " + j);
            for(int k=0; k<A-1; k++, i--)
            {
                res[i][j] = temp[x++];
            }
            i++; j++; A=A-2;
        }
        System.out.println("A: " + A);
        if(A==1)
        {
            System.out.println(A + " " + i + " " + j);
                res[i][j] = temp[x++];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new SpiralOrder2().generateMatrix(4)));
    }
}
