package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuickSort {
    public void quicksort(ArrayList<Integer> A, int l, int r) {
        if(l<=r)
        {
            int index = rearrage(A, l, r);
            quicksort(A, l, index-1);
            quicksort(A, index+1, r);
        }
    }
    public int rearrage(ArrayList<Integer> A, int low, int high) {
        int pivot = A.get(low);
        int i = low+1;
        int j = high;

        while(i<=j)
        {
            if(A.get(i)<=pivot) i++;
            else if(A.get(j)>pivot) j--;
            else Collections.swap(A, A.get(i), A.get(j));
        }
        Collections.swap(A, low, j);
        return j;
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        quicksort(A, 0, A.size()-1);
        return A;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 4, 10, 2, 1, 5));
        System.out.println(new QuickSort().solve(A));
    }
}
