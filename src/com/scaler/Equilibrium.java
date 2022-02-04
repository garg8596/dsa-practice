package com.scaler;

import java.util.*;

public class Equilibrium {
    public static int solve(ArrayList<Integer> A) {
                int len = A.size();
                ArrayList<Integer> pf = new ArrayList<>();
                ArrayList<Integer> pf_right = new ArrayList<>();
                pf.add(A.get(0));
                pf_right.add(A.get(len-1));
                for (int i=1; i<len; ++i)
                {
                    pf.add(pf.get(i-1) + A.get(i));
                }

                for(int i=len-2; i>=0; --i)
                {
                    int val = pf_right.get(len-i-2);
                    pf_right.add(val + A.get(i));
                }
                Collections.reverse(pf_right);

                for(int i=0; i<len; i++)
                {
                    if(pf_right.get(i)==pf.get(i)) return i;
                }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(3, -1, 2, -1, 1, 2, 1));
        int result = solve(res);
        System.out.println("result " + result);
    }
}

