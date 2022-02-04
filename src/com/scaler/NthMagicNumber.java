package com.scaler;
/*
Good Question.
 */

public class NthMagicNumber {
    public int solve(int A) {
        int sum = 0;
        int index = 1;
        while(A!=0)
        {
            int i = (A&1);
            sum += Math.pow(5, index) * i;
            A>>=1;
            index++;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(new NthMagicNumber().solve(10));
    }
}
