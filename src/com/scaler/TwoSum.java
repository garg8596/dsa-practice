package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
           int len = A.size();
           ArrayList<Integer> res = new ArrayList<>();
           HashMap<Integer, Integer> hm = new HashMap<>();

           for(int i=0; i<len; i++)
           {
               int a = A.get(i);
               int b = B-a;
               if(hm.get(b)==null)
               {
                   if(hm.get(a)==null) hm.put(a, i);
               }
               else{
                   res.add(hm.get(b)+1);
                   res.add(i+1);
                   return res;
               }
           }
           return res;
        }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8);
        System.out.println(new TwoSum().twoSum(list, -3));
    }

}
