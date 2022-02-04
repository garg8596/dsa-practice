package com.scaler;

public class SmallestXOR {
    public int solve(int A, int B) {
        int ans = 0;
        for(int i=30; i>=0 && B>0; i--)
        {
            if((A&(1<<i)) > 0)
            {
                ans = ans | (1<<i);
                B--;
            }
        }
        if(B!=0)
        {
            for(int i=0; i<31  && B>0; i++)
            {
                if((A&(1<<i)) == 0)
                {
                    ans = ans | (1<<i);
                    B--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new SmallestXOR().solve(3, 3));
    }
}
