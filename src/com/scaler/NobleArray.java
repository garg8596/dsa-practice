package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NobleArray {
        public int solve(ArrayList<Integer> A) {
            int len = A.size();

            Collections.sort(A);
            System.out.println(A);
            System.out.println(len);

            for(int i=0; i<len-1; i++)
            {
                int k = A.get(i);
                int count = 0;
                for(int j=i+1; j<len; j++)
                {
                    if(A.get(j) > k) count++;
                }
                if(count == k) return 1;
            }
            return -1;
        }

    public static void main(String[] args) {
            ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(6, 5, 7));
            System.out.println(new NobleArray().solve(temp));
    }
}
