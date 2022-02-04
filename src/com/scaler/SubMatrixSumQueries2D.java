package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class SubMatrixSumQueries2D {
        private final int mod = 1000000007;
        public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
                int rows = A.length;
                int cols = A[0].length;
                int sum = 0;
                int len = B.length;
                int[] ans = new int[len];
                int[][] prefix = new int[rows][cols];

                for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                                if (j == 0) prefix[i][j] = A[i][j];
                                else prefix[i][j] = prefix[i][j - 1] + A[i][j];
                        }
                }
                for (int j = 0; j < cols; j++) {
                        for (int i = 1; i < rows; i++) {
                                prefix[i][j] = prefix[i - 1][j] + prefix[i][j];
                        }
                }


                for (int i=0; i<len; i++) {
                        int a1 = B[i]-1;
                        int b1 = C[i]-1;
                        int a2 = D[i]-1;
                        int b2 = E[i]-1;
                        sum += prefix[a2][b2];
                        if (a1 > 0) sum -= prefix[a1 - 1][b2];
                        if (b1 > 0) sum -= prefix[a2][b1 - 1];
                        if (a1 > 0 && b1 > 0) sum += prefix[a1 - 1][b1 - 1];
                        sum %= mod;
                        ans[i] = sum;
                        sum = 0;
                }
                return ans;
        }

        public static void main(String[] args) {
                int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                int[] B = {1, 2};
                int[] C = {1, 2};
                int[] D = {2, 3};
                int[] E = {2, 3};

                System.out.println(Arrays.toString(new SubMatrixSumQueries2D().solve(A, B, C, D, E)));
        }
}
