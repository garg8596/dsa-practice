package com.scaler;

public class CountSetBit {
    private final int mod = 1000000007;
    public int solve(int A) {
        long[] arr = new long[A+1];
        int offset = 1;
        long sum = 0;

        for(int i=1; i<=A; i++)
        {
            if(offset*2==i) offset*=2;
            arr[i] = 1 + arr[i-offset]%mod;
        }

        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i]%mod;
        }
        return (int)sum%mod;
    }

    public static void main(String[] args) {
        System.out.println(new CountSetBit().solve(100000000));
    }
}
