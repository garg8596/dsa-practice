package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimizzeAbsDiff {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int n = A.size();
        int m = B.size();
        int o = C.size();
        int x = n-1;
        int y = m-1;
        int z = o-1;
        int ans = Integer.MAX_VALUE;
        while(x>=0 && y>=0 && z>=0)
        {
            int max = Math.max(A.get(x), Math.max(B.get(y), C.get(z)));
            int min = Math.min(A.get(x), Math.min(B.get(y), C.get(z)));
            ans = Math.min(Math.abs(max-min), ans);


            if(A.get(x)>=B.get(y) && A.get(x)>=C.get(z) && x>=0) x--;
            else if(B.get(y)>=A.get(x) && B.get(y)>=C.get(z) && y>=0) y--;
            else if(z>=0) z--;
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 4, 5, 8, 10));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(6, 9, 15 ));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(2, 3, 6, 6));

        System.out.println(new MinimizzeAbsDiff().solve(A, B, C));
    }
}
