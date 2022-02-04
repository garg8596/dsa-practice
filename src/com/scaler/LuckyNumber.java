package com.scaler;

import java.util.Arrays;

public class LuckyNumber {
    public int solve(int A) {
        int[] temp = new int[A+1];
        int count = 0;
//        for(int i=0; i<A; i++)
//        {
//            temp[i] = 0;
//        }
        System.out.println(Arrays.toString(temp));
        System.out.println(temp.length);
        for(int i=2; i<=temp.length; i++)
        {
            //System.out.println("here1");
            for(int j=2*i; j<temp.length; j+=i)
            {
                System.out.println("i: " + i + " j: " + j);
                if(temp[i]==0)
                {
                    temp[j]++;
                }
                //System.out.println(Arrays.toString(temp));
            }
        }
        //System.out.println(Arrays.toString(temp));
        int here = 0;
        for(int i=0; i<temp.length; i++)
        {
            //System.out.println("here" + (here++));
            if(temp[i]==2) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int A = 12;
        System.out.println(new LuckyNumber().solve(A));
    }
}
