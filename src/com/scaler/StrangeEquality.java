package com.scaler;

public class StrangeEquality {
    public int solve(int A) {
        int x=0, bit=0;
        while(A!=0)
        {
            if(A%2==0)
            {
                x = x | (1<<bit);
            }
            A/=2;
            bit++;
        }
        int y = (1<<bit);
        return x^y;
    }
    public static void main(String[] args) {
        System.out.println(new StrangeEquality().solve(8852855));
    }
}
