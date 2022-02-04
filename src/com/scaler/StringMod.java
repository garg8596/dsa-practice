package com.scaler;

public class StringMod {
    public int solve(String A) {
        int pow = 1;
        int value = 0;
        int len = A.length();

        if(len<3)
        {
            for(int i=len-1; i>=0; i--)
            {
                value += ((A.charAt(i))*pow)%8;
                pow = pow * 10;
            }
        }
        else
        {
            for(int i=len-1; i>=len-3; i--)
            {
                value += ((A.charAt(i))*pow)%8;
                pow = pow * 10;
            }
        }
        System.out.println(value);
        if((value%8)==0) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(new StringMod().solve("9216"));
    }
}
