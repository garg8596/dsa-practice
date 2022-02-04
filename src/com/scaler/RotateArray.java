package com.scaler;
/*
rotate array 90degree clockwise
 */

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    public ArrayList<ArrayList<Integer>>  solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int rows = A.size();
        int cols = A.get(0).size();

        for(int i=0; i<cols; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                temp.add(A.get(j).get(i));
            }
            res.add(temp);
        }
        //System.out.println("temp before:" + res);
        for(int i=0; i<rows; i++)
        {
            int x = 0;
            int y = cols-1;
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(res.get(x).get(i));
            //System.out.println(temp);
//            while(x < y)
//            {
//                int swap = res.get(i).get(x);
//                res.set(i+x, res.get(i).get(y));
//                res.set(res.get(i).get(y), swap);
//                x++; y--;
//            }
            System.out.println("temp after: "+ temp);
        }
       return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> temp1 = new ArrayList(Arrays.asList(1, 2));
        ArrayList<Integer> temp2 = new ArrayList(Arrays.asList(3, 4));

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        res.add(temp1);
        res.add(temp2);
        System.out.println("original: " + res);
        System.out.println("After 90 degree rotation: "+ new RotateArray().solve(res));
    }
}
