package com.scaler;

import java.util.Arrays;
import java.util.HashSet;

public class ChangeCharacter {
    public int solve(String A, int B) {
        int len = A.length();
        int ans = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<len; i++) hs.add(A.charAt(i));

        int[] count = new int[26];

        for(int i=0; i<len; i++)
        {
            int val = A.charAt(i)-48;
            count[val%26]++ ;
        }
        Arrays.sort(count);

        int x = 0;
        while(B>0 && x < 26)
        {
            if(count[x]!=0)
            {
                count[x]--;
                B--;
            }
            else x++;
        }

        for(int i=0; i<26; i++)
        {
            if(count[i]!=0) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "umeaylnlfd";
        System.out.println(new ChangeCharacter().solve(s, 1));
    }
}

