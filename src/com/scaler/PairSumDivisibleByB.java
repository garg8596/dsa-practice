package com.scaler;

import java.util.*;

public class PairSumDivisibleByB {
    private static int mod = 1000000007;
    public int solve(ArrayList<Integer> A, int B) {
        long ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int val : A)
        {
            System.out.println(val%B);
            hm.put(val%B, hm.getOrDefault(val%B, 0)+1);
        }

        for(int i=0; i<B; i++) hm.put(i, hm.getOrDefault(i, 0));
        System.out.println(hm);
        int x = hm.get(0);
        ans += (x*(x-1))/2;

        for(int j=1; j<=(hm.size()-1)/2; j++)
        {
            int val = hm.get(j);
            System.out.println("j: " + j + " " + val + " "+ hm.get(B-j) + " " + (val*hm.get(B-j)));
            ans += (val*hm.get(B-j))%mod;
        }
        if(B%2==0)
        {
            int val = hm.get(B/2);
            ans += (val * (val-1))/2;
        }

        return (int)ans%mod;
//        int n = a.length;
//        long mod = (long)(1e9 + 7);
//        long cnt[] = new long[k];
//        for(int x : a)    cnt[x % k]++;
//        long ans = cnt[0] * (cnt[0] - 1) / 2;
//        for(int i = 1, j = k-1; i <= j; i++, j--) {
//            if(i == j)    ans = (ans + cnt[i] * (cnt[i] - 1) / 2) % mod;
//            else    ans = (ans + cnt[i] * cnt[j]) % mod;
//        }
//        return (int)ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(93, 9, 46, 79, 56, 24, 10, 26, 9, 93, 31, 93, 75, 7, 4, 80, 19, 67, 49, 84, 62, 100, 17, 40, 35, 84, 14, 81, 99, 31, 100, 66, 70, 2, 11, 84, 60, 89, 13, 57, 47, 60, 59, 60, 42, 67, 89, 29, 85, 83, 42, 47, 66, 80, 88, 85, 83, 82, 16, 23, 21, 55, 26, 2, 21, 92, 85, 26, 46, 3, 7, 95, 50, 22, 84, 52, 57, 44, 4, 23, 25, 55, 41, 49));
        System.out.println(new PairSumDivisibleByB().solve(A, 37));
    }
}
