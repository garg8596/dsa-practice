package com.scaler;

import java.util.Arrays;
import java.util.HashMap;

public class PermutationStrings {
    public int solve(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        int count = 0;

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i=0; i<lenA; i++)
        {
            char val1 = A.charAt(i);
            hm1.put(val1, hm1.getOrDefault(val1, 0)+1);
            char val2 = B.charAt(i);
            hm2.put(val2, hm2.getOrDefault(val2, 0)+1);
        }
        if(hm1.equals(hm2)) count++;

        for(int i=lenA; i<lenB; i++)
        {
            char val2 = B.charAt(i);
            char val1 = B.charAt(i-lenA);
            hm2.put(val2, hm2.getOrDefault(val2, 0)+1);
            hm2.put(val1, hm2.get(val1)-1);
            if(hm2.get(val1)<=0) hm2.remove(val1);
            if(hm1.equals(hm2)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String A = "abc";
        String B = "abcbacabc";

        System.out.println(new PermutationStrings().solve(A, B));
    }
}
