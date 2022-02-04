package com.scaler;

/*
https://www.scaler.com/academy/mentee-dashboard/classroom/problems-on-arrays-4e51bc6d-a433-4ec7-a2e3-3e86d212639b/#assignment

Solution: https://www.geeksforgeeks.org/length-of-longest-consecutive-ones-by-at-most-one-swap-in-a-binary-string/
 */

import java.util.Arrays;

public class LongestConsecutiveOne {
    public static void main(String[] args) {
        String A = "010100110101";
        int total_count = 0;
        int len = A.length();
        int ans = 0;

        int[] left_pf = new int[len];
        int[] right_pf = new int[len];

        left_pf[0] = A.charAt(0)-48;
        for(int i=1; i<len; i++)
        {
            if(A.charAt(i)=='0') left_pf[i] = 0;
            else left_pf[i] = 1 + left_pf[i-1];
        }
        right_pf[len-1] = A.charAt(len-1)-48;
        for(int i=len-2; i>=0; i--)
        {
            if(A.charAt(i)=='0') right_pf[i] = 0;
            else right_pf[i] = 1 + right_pf[i+1];
        }

        for(int i=0; i<len; i++)
        {
            if(A.charAt(i)=='1') total_count++;
        }

        for(int i=0; i<len; i++)
        {
            if(A.charAt(i)=='0')
            {
                int l=0;
                int r=0;
                if(i>0) l = left_pf[i-1];
                if(i<len-1) r = right_pf[i+1];
                if(l + r < total_count) ans = Math.max(ans, l+r+1);
                else ans = Math.max(ans, l+r);
            }
            else if(total_count == len) ans = total_count;
        }
        System.out.println(ans);
    }
}
