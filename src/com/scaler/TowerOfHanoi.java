package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class TowerOfHanoi {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> res =  TOH(A, 1, 2, 3);
        return res;
    }

    public ArrayList<ArrayList<Integer>> TOH(int A, int S, int T, int D){
        ArrayList<Integer> list = new ArrayList<>();
        if(A==0)
        {
            return res;
        }
        TOH(A-1, S, D, T);
        list.addAll(Arrays.asList(A, S, D));
        res.add(list);
        TOH(A-1, T, S, D);

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new TowerOfHanoi().towerOfHanoi(2));
    }
}
