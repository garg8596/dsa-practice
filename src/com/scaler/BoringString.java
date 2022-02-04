package com.scaler;

import java.util.Arrays;

public class BoringString {
    public int solve(String A) {
        int odd = 0;
        int even = 0;
        int n = A.length();

        for(int i=0; i<n; i++)
        {
            if(A.charAt(i)%2==0)
            {
                even++;
            }
            else odd++;
        }

        char oddc[] = new char[odd];
        char evenc[] = new char[even];

        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++)
        {
            if(A.charAt(i)%2==0) evenc[x++] = A.charAt(i);
            else oddc[y++] = A.charAt(i);
        }

        int smallesto = 0;
        int smalleste = 0;
        int largesto = 0;
        int largeste = 0;

        //for(int )
        return 0;
    }

    public static void main(String[] args) {
        String A = "abcd";
        System.out.println(new BoringString().solve(A));
    }
}
