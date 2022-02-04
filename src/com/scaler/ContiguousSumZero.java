package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ContiguousSumZero {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = A.size();
        int sum = 0;
        hm.put(sum, -1);
        int start = -1;
        int end = -1;
        int ans = 0;
        for(int i=0; i<n; i++)
        {
            sum += A.get(i);
            if(!hm.containsKey(sum)) hm.put(sum, i);
            else
            {
                if(ans < i-hm.get(sum))
                {
                    ans = i-hm.get(sum);
                    start = hm.get(sum);
                    end = i;
                }
            }
        }

        System.out.println(start + " " + end);

        for(int i=start+1; i<=end; i++)
        {
            list.add(A.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -2, 4, -4));
        System.out.println(new ContiguousSumZero().lszero(A));
    }
}
