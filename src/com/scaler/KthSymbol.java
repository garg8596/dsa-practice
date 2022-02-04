package com.scaler;

import java.util.ArrayList;

public class KthSymbol {
    ArrayList<String> ans = new ArrayList<>();
    int xor = 1;
    public int solve(int A, int B) {
//        if(A==1)
//        {
//            ans.add("0");
//        }
//        //if(A==0) return 0;
//
//        solve(A-1, B);
//        int temp = Integer.parseInt(ans.get(A-1));
//        ans.add(Integer.toString(temp));
//        ans.add(Integer.toString(temp^xor));
//
//        return ans.get(A).charAt(B);
        return Integer.bitCount(B-1)&1;
    }

    public static void main(String[] args) {
        System.out.println(new KthSymbol().solve(2, 2));
    }
}
