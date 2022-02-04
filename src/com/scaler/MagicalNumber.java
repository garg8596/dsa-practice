package com.scaler;


//public int solve(int A, int B, int C) {
//
//        long low = 2, high = (long) 1e15, ans = 2;
//        while (low <= high) {
//        long mid = (high - low) / 2 + low;
//        // count numbers <= mid divisible by B, C and both B, C.
//        long cntB = mid / B, cntC = mid / C, cntBC = mid / lcm;
//        if (cntB + cntC - cntBC >= A) {
//        ans = mid;
//        high = mid - 1;
//        } else
//        low = mid + 1;
//        }
//        return (int)(ans % (1000 * 1000 * 1000 + 7));
//        }

public class MagicalNumber {
    private int mod = 1000000007;
    public int gcd(int x, int y) {
        if (x == 0)
            return y;
        return gcd(y % x, x);
    }
    public int solve(int A, int B, int C) {
        int x = B;
        int y = C;
        long n = A;

        long lcm = (long) x * y / gcd(x, y);

        long l = 2;
        long r = (long) 1e15;
        long ans = 2;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long val = (mid /(long) x) + (mid /(long)y) - (mid / lcm);
            if (val >= n)
            {
                ans = mid;
                r = mid-1;
            }
            else l = mid + 1;
        }
        return (int)ans%mod;
    }

    public static void main(String[] args) {
        System.out.println(new MagicalNumber().solve(807414236, 3788, 38141));
        //System.out.println(new MagicalNumber().solve(1, 2, 3));
    }
}
