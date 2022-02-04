package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class GivenSumII {
    private final int mod = 1000000007;
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int i = 0;
        int j = n-1;
        int count = 0;
        long ans = 0;

        while(i<j)
        {
            int sum = A.get(i)+A.get(j);
            if(sum==B)
            {
                //Objects.equals(list.get(i), list.get(k)
                if(Objects.equals(A.get(i), A.get(j)))//imp--> to compare two element in list, use this instead of ==
                {
                    System.out.println(sum);
                    count = j-i+1;
                    ans += count*(count-1)/2;
                    break;
                }
                else
                {
                    int counti = 0;
                    int countj = 0;
                    int x = A.get(i);
                    while(i<=j && x == A.get(i))
                    {
                        counti++;
                        i++;
                    }
                    int y = A.get(j);
                    while(i<=j && y==A.get(j))
                    {
                        countj++;
                        j--;
                    }
                    ans += counti*countj;
                    ans%=mod;
                }
            }
            else if(sum > B) j--;
            else i++;
        }
        return (int)ans%mod;
    }

    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 4, 5, 6, 7, 10));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666));
        System.out.println(new GivenSumII().solve(list, 9259332));
        //System.out.println(new GivenSumII().solve(list, 13));
    }
}
