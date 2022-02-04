package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;

/*
https://www.youtube.com/watch?v=s0JtNntehsM
 */

public class SumOddEven {
    public int solve(ArrayList<Integer> A) {
        int ans = 0;
        int len = A.size();
        int odd_sum = 0;
        int even_sum = 0;
        ArrayList<Integer> odd_pf = new ArrayList<>();
        ArrayList<Integer> even_pf = new ArrayList<>();

        for(int i=0; i<len; i++)
        {
            if(i%2==0) even_sum += A.get(i);
            else odd_sum += A.get(i);

            odd_pf.add(odd_sum);
            even_pf.add(even_sum);
        }
        for(int i=0; i<len; i++)
        {
            if(i==0)
            {
                int odd = even_pf.get(len-1) - A.get(0);
                int even = odd_pf.get(len-1);

                if(odd == even) ans++;
                continue;
            }
            int odd = odd_pf.get(i-1) + even_pf.get(len-1) - even_pf.get(i);
            int even = even_pf.get(i-1) + odd_pf.get(len-1) - odd_pf.get(i);

            if(odd == even) ans++;
        }
        return ans;
    }


    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(1, 1, 1));
        System.out.println(new SumOddEven().solve(res));
    }
}
