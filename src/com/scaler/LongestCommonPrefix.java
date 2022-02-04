package com.scaler;

public class LongestCommonPrefix {

    private static String CommonPrefixUtil(String prefix, String s) {
        String result = "";
        int n1 = prefix.length();
        int n2 = s.length();

        for(int i=0, j=0; i<n1 && j<n2; i++, j++)
        {
            if(prefix.charAt(i)!=s.charAt(j)) break;
            result += prefix.charAt(i);
        }
        return result;
    }

    public static String solve(String[] str){
        String prefix = str[0];

        for(int i=1; i<str.length; i++)
        {
            prefix = CommonPrefixUtil(prefix, str[i]);
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] str = {"geeksforgeeks", "geeks",
                "geek", "geezer"};

        System.out.println(new LongestCommonPrefix().solve(str));
    }
}
