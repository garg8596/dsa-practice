package com.scaler;

import java.util.ArrayList;

public class Pattern1 {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int i=0; i<A; i++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            int k = 1;
            for(int x=0; x<A; x++)
            {
                temp.add(0);
            }
            for(int j=0; j<=i; j++, k++)
            {
                temp.set(j, k);
            }
            res.add(temp);
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(new Pattern1().solve(4));
    }
}
