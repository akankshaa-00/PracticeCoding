package org.example.arrays;

public class MaximumProductSubArray {

    public static void main(String[] args) {
        int[] nums={2,-3,-2,-1,1,0,5,1,3,-1};
        //ans=
        System.out.println(maxProd(nums));
    }
    public static int maxProd(int[] nums) {
       int max=nums[0];
       int min=nums[0];
       int ans=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(Math.max(max*nums[i],min*nums[i]),nums[i]);
            min=Math.min(Math.min(max*nums[i],min*nums[i]),nums[i]);

            if(max>ans)
            {
                ans=max;
            }
        }
        return ans;
    }
}
