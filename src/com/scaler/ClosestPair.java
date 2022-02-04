package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestPair {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.size();
        int m = B.size();
        int ansi = 0;
        int ansj = 0;
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = m-1;

        while(j>=0 && i<n)
        {
            int val = Math.abs(A.get(i)+B.get(j));
            int diff = Math.abs(val-C);
            if(min>=diff)
            {
                if(min==diff)
                {
                    if(ansi >= A.get(i))
                    {
                        ansi = A.get(i);
                        ansj = Math.min(ansj, B.get(j));
                    }
                }
                else
                {
                    min = Math.abs(diff);
                    ansi = A.get(i);
                    ansj = B.get(j);
                }
            }
            if(val>C && j>=0) j--;
            else if(val<C && i<n) i++;
            else
            {
                ansi = A.get(i);
                ansj = B.get(j);
                ans.add(ansi);
                ans.add(ansj);
                return ans;
            }
        }
        ans.add(ansi);
        ans.add(ansj);
        return ans;
    }

    public static void main(String[] args) {
        //ArrayList<Integer> A = new ArrayList<>(Arrays.asList(6, 7, 9, 13, 21, 29, 56, 74, 77, 83, 84, 88, 93, 96, 101, 104, 114, 115, 122, 125, 144, 147, 151, 152, 154, 161, 165, 167, 174, 179, 185, 189, 192, 194, 198, 201, 203, 208, 224, 229, 230, 238, 252, 253, 257, 264, 266, 275, 278, 279, 282, 284, 291, 312, 316, 322, 332, 335, 336, 339, 364, 380, 381, 384, 387, 388, 390, 392, 394, 395, 401, 403, 431, 432, 440, 442, 443, 444, 446, 451, 454, 461, 470, 483, 492));
        //ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 8, 13, 16, 19, 21, 22, 23, 37, 48, 63, 66, 68, 71, 72, 95, 102, 116, 123, 127, 131, 132, 146, 148, 153, 171, 173, 179, 187, 194, 215, 220, 227, 229, 240, 245, 254, 255, 257, 259, 271, 276, 277, 286, 296, 312, 314, 318, 321, 333, 339, 341, 343, 355, 356, 359, 363, 364, 380, 390, 393, 398, 401, 409, 413, 417, 427, 442, 444, 446, 454, 455, 459, 460, 468, 471, 473, 475, 476, 478, 479, 482, 483, 488, 489));
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 4));
        int C = 4;
        System.out.println(new ClosestPair().solve(A, B, C));
    }
}
