package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class BitonicArray {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int l = 0;
        int r = n-1;
        int peak = 0;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(A.get(mid)>A.get(mid-1) && A.get(mid)>A.get(mid+1))
            {
                peak = mid;
                break;
            }
            else if(A.get(mid)<A.get(mid-1) && A.get(mid)>A.get(mid+1)) r = mid-1;
            else l = mid+1;
        }
        if(A.get(peak-1) < B && A.get(peak+1) > B)
        {
            l = peak+1;
            r = n-1;
            while(l<=r)
            {
                int mid = l+(r-l)/2;
                if(A.get(mid)==B) return mid;
                else if(A.get(mid)<B)  r = mid-1;
                else l = mid+1;
            }
        }
        else
        {
            l = 0;
            r = peak-1;
            while(l<=r)
            {
                int mid = l+(r-l)/2;
                if(A.get(mid)==B) return mid;
                else if(A.get(mid)<B)  l = mid+1;
                else r = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31));
        System.out.println(new BitonicArray().solve(list, 44));
    }
}
