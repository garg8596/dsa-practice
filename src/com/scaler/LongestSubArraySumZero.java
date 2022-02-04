package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LongestSubArraySumZero {
        public ArrayList<Integer> lszero(ArrayList<Integer> A) {
            int lenA = A.size();
            int ans = Integer.MIN_VALUE;
            int initial_index = -1;
            int final_index = -1;

            ArrayList<Integer> pf_list = new ArrayList<>();
            ArrayList<Integer> result = new ArrayList<>();
            HashMap<Integer, Integer> hm = new HashMap<>();

            pf_list.add(A.get(0));

            for(int i=1; i<lenA; i++)
            {
                pf_list.add(pf_list.get(i-1)+A.get(i));
            }

            //System.out.println(pf_list);
            int lenPf = pf_list.size();
            hm.put(0, -1);

            for(int i=0; i<lenPf; i++)
            {
                if(!hm.containsKey(pf_list.get(i))) hm.put(pf_list.get(i), i);
                else
                {
                    int prev_ans = Math.max(ans, i-hm.get(pf_list.get(i)));
                    if(prev_ans > ans)
                    {
                        ans = prev_ans;
                        initial_index = hm.get(pf_list.get(i));
                        final_index = i;
                    }
                }
            }

            for(int i=initial_index+1; i<=final_index; i++) result.add(A.get(i));

            return result;
        }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -3, 3 ));
        System.out.println(new LongestSubArraySumZero().lszero(A));
    }

}
