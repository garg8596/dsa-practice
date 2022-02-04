package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DistinctWindow {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.size();

        for(int i=0; i<B; i++)
        {
            int val = A.get(i);
            if(!hm.containsKey(val)) hm.put(val, 1);
            else
            {
                hm.put(val, hm.get(val)+1);
            }
        }

        ans.add(hm.size());

        System.out.println(ans);
        System.out.println(hm);
        for(int i=B; i<n; i++)
        {
            int val = A.get(i);
            if(!hm.containsKey(val)) hm.put(val, 1);
            else
            {
                hm.put(val, hm.get(val)+1);
            }
            hm.put(A.get(i-B), hm.get(A.get(i-B))-1);
            if(hm.get(A.get(i-B))<=0) hm.remove(A.get(i-B));
            ans.add(hm.size());
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList( 1, 2, 1, 3, 4, 3));
        System.out.println(new DistinctWindow().dNums(A, 3));
    }
}
