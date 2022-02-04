package com.scaler;

import java.util.*;

public class XorQueries {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> xor = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();


        int count = 0;

        xor.add(A.get(0));
        for(int i=1; i<A.size(); ++i)
        {
            xor.add(A.get(i)^xor.get(i-1));
        }

        int arr[] = new int[A.size()];
        for(int i=0; i<A.size(); ++i)
        {
            if(A.get(i)==0) arr[i] = 1;
            else arr[i] = 0;
        }

        for(int i=0; i<A.size(); ++i)
        {
            if(A.get(i)==0) count++;
            zero.add(count);
        }

        for(int i=1; i<=B.size(); ++i) {
            int left = B.get(i-1).get(0);
            int right = B.get(i-1).get(1);
            System.out.println("left: " + left + " right: " + right);
            int result = xor.get(right-1) ^ xor.get(left-1) ^ A.get(left-1);
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(result);
            temp.add(zero.get(right-1) - zero.get(left-1) + arr[left-1]);
            list.add(temp);
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,0,0,0,1));
        ArrayList<Integer> temp1 = new ArrayList<>(Arrays.asList(2, 4));
        ArrayList<Integer> temp2 = new ArrayList<>(Arrays.asList(1, 5));
        ArrayList<Integer> temp3 = new ArrayList<>(Arrays.asList(3, 5));

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        res.add(temp1);
        res.add(temp2);
        res.add(temp3);

        System.out.println(new XorQueries().solve(A, res));

    }
}
