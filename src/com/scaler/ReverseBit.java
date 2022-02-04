package com.scaler;

public class ReverseBit {
    public long reverse(long a) {
        //didn't understand this logic
        long ans = 0;
        for(long i=0; i<32; i++)
        {
            ans<<=1;
            if(((1<<i)&a) > 0)
            {
                ans = ans | 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long A = 3;
        System.out.println(new ReverseBit().reverse(A));
    }
}
