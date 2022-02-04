package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSum {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Collections.sort(A);
        int n = A.size();
        for(int k=0; k<n-2; k++)
        {
            int i = k+1;
            int j = n-1;
            while(i<j)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                int sum = A.get(i)+A.get(j)+A.get(k);
                if(sum==0)
                {
                    temp.add(A.get(i));
                    temp.add(A.get(j));
                    temp.add(A.get(k));
                    Collections.sort(temp);
                    i++;
                    j--;
                    if(!ans.contains(temp))ans.add(temp);
                    //System.out.println(temp);
                }
                else if(sum>0) j--;
                else i++;
                //if(temp.size()!=0)
            }
        }
        return ans;
        //[-5 0 5 ] [-5 1 4 ] [-4 -1 5 ] [-4 0 4 ] [-4 1 3 ]
        //[-3 -2 5 ] [-3 -1 4 ] [-3 0 3 ] [-2 -1 3 ] [-2 1 1 ] [-1 0 1 ] [0 0 0 ]
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3));
        System.out.println(new ThreeSum().threeSum(list));
    }

}
