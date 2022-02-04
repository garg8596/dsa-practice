package com.scaler;

import java.util.ArrayList;

public class PascalKthRow {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList();
        for (int i=0; i<=A; ++i) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<=i; ++j)
            {
                if(j==0 || j==i) temp.add(1);
                else temp.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            res.add(temp);
        }
        return res.get(A);
    }

    public static void main(String[] args) {
        System.out.println(new PascalKthRow().getRow(3));
    }
}


