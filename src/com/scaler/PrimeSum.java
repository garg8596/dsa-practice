package com.scaler;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrimeSum {
    public int[] primesum(int A) {
        boolean[] isPrime = new boolean[A+1];
        int[] ans = new int[2];
        for(int i=0; i<isPrime.length; i++) isPrime[i] = true;
        System.out.println(Arrays.toString(isPrime));

        for(int i=2; i*i<=isPrime.length; i++)
        {
            if(isPrime[i])
            {
                for(int j=i*i; j<isPrime.length; j+=i)
                {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println(Arrays.toString(isPrime));
        int i=2; int j=isPrime.length-1;
        int sum = 0;
        int x = 0;
        int y = 1;
        while(i<=j)
        {
            System.out.println("here1");
            if(isPrime[i]==true && isPrime[j]==true)
            {
                System.out.println("here2");
                sum = i+j;
                if(sum == A)
                {
                    ans[x] = i;
                    ans[y] = j;
                    return ans;
                }
                else if(sum < A) i++;
                else j--;
            }
            else if(isPrime[i]==false) i++;
            else j--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int A = 184;
        System.out.println(Arrays.toString(new PrimeSum().primesum(A)));
    }
}
