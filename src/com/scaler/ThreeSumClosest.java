package com.scaler;

import java.util.Arrays;

public class ThreeSumClosest {
    public int solve(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        int x = 0;
        for (int i=0; i<n-2; i++)
        {
            int j = i+1;
            int k = n-1;
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<target)
                {
                    int diff = Math.abs(sum-target);
                    if(min > diff)
                    {
                        min = diff;
                        ans = sum;
                    }

                    System.out.println("sum: " + sum + " diff: " + diff + " min: " + min);
                    j++;
                }
                else if(sum>target)
                {
                    int diff = Math.abs(sum-target);
                    if(min > diff)
                    {
                        min = diff;
                        ans = sum;
                    }
                    System.out.println("sum: " + sum + " diff: " + diff + " min: " + min);
                    k--;
                }
                else return sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //int[] A = {10, 1, 6, 10, -4, 1, -3, -10, -7, 10, -2, -5, 1, 7, -1, 7, -9, -7, 5, -2, 7, -1, -1, 10, 6, 0, -2, 9, 5, -9, 4, 8, 3, -6, -7, 0, 9, 3, 0, -10, 3, 7, -9, 10, -4, 7, 2, 1, -9, 3, 10, 4, 0, -2, -5, -4, 9, 10, 8, 7, 2, 1, 0, 3, 4, 7, 4, -3, 0, 8, -1};
        int[] A =  {2, 1, -9, -7, -8, 2, -8, 2, 3, -8};
        System.out.println(new ThreeSumClosest().solve(A, -1));
    }
}
