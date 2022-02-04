package com.scaler;

public class LargestCoPrime {
    //didn't know how to solve
        private static int gcd(int x, int y){
            if(x>y)
            {
                int swap = x;
                x = y;
                y = swap;
            }
            while(x>0)
            {
                int temp = x;
                x = y%x;
                y = temp;
            }
            return y;
        }
        public int cpFact(int A, int B) {
            while (gcd(A, B) != 1)
                A = A / gcd(A, B);
            return A;
        }

    public static void main(String[] args) {
        System.out.println(new LargestCoPrime().cpFact(778332288, 555687933));
    }
}
