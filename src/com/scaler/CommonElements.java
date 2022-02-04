package com.scaler;

import java.util.*;

public class CommonElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int lenA = A.size();
        int lenB = B.size();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();

        for(int i=0; i<lenA; i++)
        {
            if(!hm1.containsKey(A.get(i))) hm1.put(A.get(i), 1);
            else hm1.put(A.get(i), hm1.get(A.get(i))+1);
        }
        System.out.println(hm1);
        for(int i=0; i<lenB; i++)
        {
            if(!hm2.containsKey(B.get(i))) hm2.put(B.get(i), 1);
            else hm2.put(B.get(i), hm2.get(B.get(i))+1);
        }
        System.out.println(hm2);
        for(Map.Entry<Integer, Integer> e : hm1.entrySet())
        {
            int val = e.getKey();
            if(hm2.containsKey(val))
            {
                int min = Math.min(hm1.get(val), hm2.get(val));
                System.out.println("min: " + min);
                for(int i=0; i<min; i++) list.add(val);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 1, 2));

        System.out.println(new CommonElements().solve(list1, list2));
    }
}
