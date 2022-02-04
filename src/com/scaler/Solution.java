package com.scaler;

public class Solution {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder(A);
        sb.append(A);

        for(int i=0; i<sb.length(); i++)
        {
            if(sb.charAt(i)>=65 && sb.charAt(i)<=90)
            {
                //remember when you are deleting string/array dynamically,
                // make sure its length should also be dynamic like in the example, *Read Carefully Imp*
                sb.deleteCharAt(i);
                i--;
            }
        }
        for(int i=0; i<sb.length(); i++)
        {
            if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u') sb.setCharAt(i, '#');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "lLdfRVCgbkND";
        System.out.println(new Solution().solve(str));
    }
}

