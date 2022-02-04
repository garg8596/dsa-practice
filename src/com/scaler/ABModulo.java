package com.scaler;

public class ABModulo {
    public int solve(int A, int B) {

        int value = Math.abs(A-B);
        return value;
    }

    public static void main(String[] args) {
        System.out.println(new ABModulo().solve(106978, 4487506));
    }
}
