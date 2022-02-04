package com.scaler;

import java.util.*;

public class FrequencyStack {
    public int[] solve(int[][] A) {
        int n = A.length;
        int temp_val = -1;
        int max = Integer.MIN_VALUE;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++)
        {
            int value = A[i][0];
            int data = A[i][1];

            if(value==1)
            {
                if(!hm.containsKey(data)) hm.put(data, 1);
                else hm.put(data, hm.get(data)+1);
                int freq = hm.get(data);
                if(max < freq)
                {
                    max = freq;
                    temp_val = data;
                }
                ans[i] = -1;
                st.push(data);
            }
            else
            {
                if(!st.empty())
                {
                    int temp = st.pop();
                    //while
                    hm.put(temp, hm.get(temp)-1);
                    if(hm.get(temp) <= 0) hm.remove(temp);
                    System.out.println("st: " + st);
                    System.out.println("hm: " + hm);
                }
            }
        }
        System.out.println(hm);
        return ans;
    }

    public static void main(String[] args) {
        int[][] A = { {1, 5},
                {1, 7},
                {1, 5},
                {1, 7},
                {1, 4},
                {1, 5},
                {2, 0},
                {2, 0},
                {2, 0},
                {2, 0} };

        System.out.println(Arrays.toString(new FrequencyStack().solve(A)));
    }
}
