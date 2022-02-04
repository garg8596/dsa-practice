package com.scaler;
/*
https://www.interviewbit.com/problems/maximum-sum-square-submatrix/
Solution: https://www.interviewbit.com/problems/maximum-sum-square-submatrix/
Try to use prefix sum method for 2d array,
 */

import java.util.Arrays;

public class MaximumSumSubArray {
    public int solve(int[][] A, int B) {
        int rows = A.length;
        int cols = A[0].length;
        int total_sum = 0;
        int row_max_index = 0;
        int col_max_index = 0;

        int[] row_arr = new int[rows];
        int[] col_arr = new int[cols];

        for(int i=0; i<rows; i++)
        {
            int row_sum = 0;
            for(int j=0; j<cols; j++)
            {
                row_sum += A[i][j];
            }
            row_arr[i] = row_sum;
        }
        for(int j=0; j<cols; j++)
        {
            int col_sum = 0;
            for(int i=0; i<rows; i++)
            {
                col_sum += A[i][j];
            }
            col_arr[j] = col_sum;
        }
        int row_max = Integer.MIN_VALUE;
        for(int i=0; i<row_arr.length; i++)
        {
            if(row_max < row_arr[i])
            {
                row_max = row_arr[i];
                row_max_index = i;
            }
        }
        int col_max = Integer.MIN_VALUE;
        for(int i=0; i<col_arr.length; i++)
        {
            if(col_max < col_arr[i])
            {
                col_max = col_arr[i];
                col_max_index = i;
            }
        }
        int x = B;
        int y = B;
       for(int i=0; i<x && i+row_max_index<rows; i++)
       {
           for(int j=0; j<y && j+col_max_index<cols; j++)
           {
               total_sum += A[i+row_max_index][j+col_max_index];
           }
       }
        System.out.println("row: " + Arrays.toString(row_arr));
        System.out.println("col: " + Arrays.toString(col_arr));
        return total_sum;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 1, 1, 1, 1},
        {2, 2, 2, 2, 2},
        {3, 8, 6, 7, 3},
        {4, 4, 4, 4, 4},
        {5, 5, 5, 5, 5}};
        //int[][] A = {{2, 2}, {2, 2}};

        System.out.println(new MaximumSumSubArray().solve(A, 3));
    }
}
