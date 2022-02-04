package com.scaler;
/*
https://www.youtube.com/watch?v=yv6svAfoYik&t=902s
 */

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        if(arr.length <= 1) return arr;

        int mid = arr.length/2;

        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];

        for(int i=0; i<mid; i++) left[i] = arr[i];
        for(int i=mid; i<arr.length; i++) right[i-mid] = arr[i];

        int[] result = new int[arr.length];

        left = mergeSort(left);
        right = mergeSort(right);

        result = merge(left, right);

        return result;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i=0, j=0, k=0;

        while(i< left.length && j < right.length)
        {
            if(left[i]<=right[j]) result[k++] = left[i++];
            else result[k++] = right[j++];
        }
        while(i< left.length)
        {
            result[k++] = left[i++];
        }
        while(j< right.length)
        {
            result[k++] = right[j++];
        }
        return result;

    }


    public static void main(String[] args) {
        int[] res = {2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2 };
        //int[] res = {5, 4, 3, 2, 1};
        System.out.println("Initial Array");
        System.out.println(Arrays.toString(res));
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(mergeSort(res)));
    }
}
