package com.scaler;

import java.util.Scanner;

public class StringReverse {
    private static String reverse(String input) {
        if(input.length()==0) return "";

        String ans = input.charAt(input.length()-1) + reverse(input.substring(0, input.length()-1));
        return ans;
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(reverse(input));
    }
}
