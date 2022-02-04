package com.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AggressiveCow {
    private boolean check(ArrayList<Integer> A, int k, int B) {
        int n = A.size();
        if((k*(B-1))<=(A.get(n-1)-A.get(0))) return true;
        return false;

//         int last_placed = A.get(0);
//         int count = 1;
//
//         for(int i=1; i<n; i++)
//         {
//             if((A.get(i)-last_placed)>=k)
//             {
//                 count++;
//                 last_placed = A.get(i);
//                 if(count == B) return true;
//             }
//         }
//         return false;
    }
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        System.out.println(A);
        int n = A.size();
        int ans = -1;
        int l = 1;
        int r = A.get(n-1)-A.get(0);

        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(check(A, mid, B))
            {
                System.out.println("mid: " + mid);
                ans = mid; // Math.max(ans, mid);
                l = mid+1;
            }
            else r = mid-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(82, 61, 38, 88, 12, 7, 6, 12, 48, 8, 31, 90, 35, 5, 88, 2, 66, 19, 5, 96, 84, 95 ));
        System.out.println(new AggressiveCow().solve(list, 8));
    }
}
