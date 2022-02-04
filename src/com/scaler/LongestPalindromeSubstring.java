package com.scaler;
/*
https://leetcode.com/problems/longest-palindromic-substring/discuss/2928/Very-simple-clean-java-solution
 */

public class LongestPalindromeSubstring {
    private int lo, maxLen, ho;
    public void expand(String s, int p1, int p2){
        while(((p1 >= 0 && p2 < s.length()) && (s.charAt(p1) == s.charAt(p2))))
        {
            p1--;
            p2++;
        }
        //important memorize this if needed
        if(maxLen < p2-p1-1)
        {
            lo = p1+1;
            maxLen = p2-p1-1;
            ho = p2;
        }
    }
    public String longestPalindrome(String A) {
        int ans = 0;
        int len = A.length();
        if(len < 2) return A;

        for(int i=0; i<len-1; i++)
        {
            /*
            //If we ask to know the only the length of longest palindromic substring.
               ans = Math.max(ans, expand(A, i, i)); // assume length of string is odd, try expanding from that
               ans = Math.max(ans, expand(A, i, i+1));//assume length of string is even, try expanding from that
             */
            //Here we are returning the longest palindromic substring.
            expand(A, i, i);
            expand(A, i, i+1);
        }
        //return ans;
        return A.substring(lo, ho);
    }

    public static void main(String[] args) {
        String str = "abccbaxyz";
        System.out.println(new LongestPalindromeSubstring().longestPalindrome(str));
    }
}

