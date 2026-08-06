package org.example.arrays;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums,int target) {
    int l=0;
    int r=nums.length-1;
    Arrays.sort(nums);
    int[] ans=new int[2];
    int curr=0;

    while(l<r)
    {
        curr=nums[l]+nums[r];
        if(curr==target)
        {
            ans[0]=l;
            ans[1]=r;
            return ans;
        }else if(curr<target)
        {
            l++;
        }else{
            r--;
        }
    }
        return ans;
    }

//    public static int[] alternateWay(int[] nums)
//    {
//        //Another way where need to return original index of elements
//
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<nums.length;i++)
//        {
//            map.put(nums[i],i);//storing value and its index in hasmap
//        }
//        //sort map on the basis of keys
//        //since a hashmap cant be sorted// then we will sort list with map keys
//
//        List<Integer> list=new ArrayList<>(map.keySet());
//        //list.sort();
//    }
}
