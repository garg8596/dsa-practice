package com.scaler;

public class DivideWithBit {
    public int divide(int dividend, int divisor) {
        int sign = (dividend<0^divisor<0)?-1:1;
        long temp = 0;
        long ans = 0;

        if(dividend == 0) return 0;
        long y = divisor;
        y = Math.abs(y);
        long x = dividend;
        x = Math.abs(x);

        System.out.println("divisor: " + divisor + " dividend: " + x);

        for(long i=30; i>=0; i--)
        {
            if(temp + (y<<i) <=x)
            {
                temp += (y<<i);
                ans |= 1L<<i;
            }
        }

        if(sign<0) ans = -ans;
        System.out.println("ans: " + ans + " min: " + Integer.MIN_VALUE);
        if(ans >= Integer.MAX_VALUE || ans > Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int)ans;
    }

    public static void main(String[] args) {
        int a = -2147483648, b=1;
        System.out.println(new DivideWithBit().divide(a, b));
    }
}