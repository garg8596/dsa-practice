package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SubArraySumZero {
    public int solve(ArrayList<Integer> A) {
        //ArrayList<Long> pf = new ArrayList<>();
        long sum = 0;
        HashSet<Long> hs = new HashSet<>();
        int n = A.size();

        //pf.add((long)A.get(0));
        hs.add((long)0);
        for(int i=1; i<n; i++)
        {
            //pf.add(A.get(i)+pf.get(i-1));
            sum += A.get(i);
            if(hs.contains(sum)) return 1;
            else hs.add(sum);
        }

        //System.out.println(pf);

        //for(int i=0; i<n; i++) hs.add(pf.get(i));

        //if(hs.contains((long)0) || hs.size() < n) return 1;
        //else
        return 0;

    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(96, -71, 18, 66, -39, -32, -16, -83, -11, -92, 55, 66, 93, 5, 50, -45, 66, -28, 69, -4, -34, -87, -32, 7, -53, 33, -12, -94, -80, -71, 48, -93, 62));
        System.out.println(new SubArraySumZero().solve(A));
    }
}
