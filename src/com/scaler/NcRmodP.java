package com.scaler;

public class NcRmodP {
    private static long pow(long x, int y, int k) {
        //didn't understand the solution.
        long result = 1;
        while(y>0)
        {
            if(y%2==1)
            {
                result = (result*x)%k;
                y--;
            }
            y>>=1;
            x = (x*x)%k;
        }
        return result;
    }
    public int solve(int A, int B, int C) {
       if(C==1) return 0;
       if(A==1) return 1;

       long mx = Math.max(A-B, B);
       long mn = Math.min(A-B, B);
       long deno = 1, numo = 1;

       for(long n=mx+1; n<A+1; n++) numo = (numo*n)%C;

       for(int d=2; d<mn+1; d++) deno = (deno*d)%C;


       return (int)((numo*pow(deno, C-2, C))%C);
    }


    public static void main(String[] args) {
        int A = 3985;
        int B = 574;
        int C = 92867;

        System.out.println(new NcRmodP().solve(A, B, C));
    }
}
