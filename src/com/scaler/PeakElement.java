package com.scaler;

import java.util.Arrays;

public class PeakElement {
        public int perfectPeak(int[] A) {
            int len = A.length;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int[] min_array = new int[len];
            int[] max_array = new int[len];

            min_array[0] = A[0];
            max_array[0] = A[0];
            //{5, 1, 4, 3, 6, 8, 10, 7, 9};
            for(int i=1; i<len; i++)
            {
                if(min_array[i-1] > A[i])  min_array[i] = A[i];
                else min_array[i] = min_array[i-1];
            }
            for(int i=1; i<len; i++)
            {
                if(max_array[i-1] < A[i])  max_array[i] = A[i];
                else max_array[i] = max_array[i-1];
            }
            System.out.println("min_array: " + Arrays.toString(min_array));
            System.out.println("max_array: " + Arrays.toString(max_array));

            for(int i=1; i<len-1; i++)
            {
                if(A[i] < max_array[i+1] && A[i] > min_array[i-1]) return 1;
            }
            return 0;
        }

        public static void main(String[] args) {
            int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
            System.out.println(new PeakElement().perfectPeak(arr));
        }
}
