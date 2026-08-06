package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        //Input: nums = [-1,0,1,2,-1,-4]
        //sorted = [-4,-1,-1,0,1,2]
        //Output: [[-1,-1,2],[-1,0,1]]

        //target=0;
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        System.out.println(triplets(nums));
    }

    public static List<List<Integer>> triplets(int[] nums) {

        //Take firstnumber first
        //find left balance to find other two
        //then follow two sum approach using two pointers
        int l=0;
        int r=nums.length-1;
        int bal=0;
        List<List<Integer>> finalans=new ArrayList<>();

        for(int i=0;i<nums.length;i++) //FIX 1st element
        {
            l=i+1;
            r=nums.length-1;
            bal=0-nums[i];
            while(l<r)
            {
            if(nums[l]+nums[r]==bal)
            {
                List<Integer> ans=new ArrayList<>();
                ans.add(nums[i]);
                ans.add(nums[l]);
                ans.add(nums[r]);
                finalans.add(ans);
                l++;
                r--;
            }else if((nums[l]+nums[r])<bal)
            {
                l++;
            }else {
                r--;
            }
            }
        }
        return finalans;
    }

}
