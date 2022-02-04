package com.scaler;

import java.util.Arrays;
/*
https://leetcode.com/problems/counting-bits/discuss/79539/Three-Line-Java-Solution
 */

public class Count1 {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        //int count = 0;
        for(int i=1; i<=n; i++)
        {
            ans[i] = ans[i>>1]+(i&1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Count1().countBits(4)));
        //System.out.println(new Count1().countBits(4));
    }
}
