package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinXOR {
    public int findMinXor(ArrayList<Integer> A) {
        int n = A.size();
        Collections.sort(A);
        int xor = A.get(0)^A.get(1);

        for(int i=1; i<n-1; i++)
        {
            xor = Math.min(xor, A.get(i)^A.get(i+1));
        }
        return xor;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 4, 6, 2));
        System.out.println(new MinXOR().findMinXor(list));
    }
}
