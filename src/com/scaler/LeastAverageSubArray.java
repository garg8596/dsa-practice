package com.scaler;
import java.util.*;
import java.lang.*;

public class LeastAverageSubArray {
    public int solve(ArrayList<Integer> A, int B){
        int len = A.size();
        double Bi = B;
        int index = 0;
        int sum = 0;
        ArrayList<Integer> pf = new ArrayList<>();
        pf.add(A.get(0));
        for(int i=1; i<len; ++i)
        {
            pf.add(A.get(i)+pf.get(i-1));
        }
        System.out.println(pf);
        double avg1 = pf.get((int) (Bi-1))/Bi;
        System.out.println(avg1);
        for(int i=1; i<=len-B; ++i)
        {
            int j = B+i-1;
            double avg2 = (pf.get(j) - pf.get(i-1))/Bi;

            if(avg2<avg1)
            {
                index = i;
                System.out.println(i);
                avg1 = avg2;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11));
        System.out.println(new LeastAverageSubArray().solve(res, 9));
    }
}
