package org.example.arrays;

import java.util.concurrent.RecursiveTask;

public class MaxSumSubArray {

        public static void main(String[] args) {
            int[] nums={2,3,-2,-1,1,0,5,1,3,-1};
            //ans=
            System.out.println(maxSum(nums));
        }
        public static int maxSum(int[] nums)
        {
            //Kadanes Algorithm
            //find out sum :- if greater than i keep,else restore to i
            int currentsum=nums[0];
            int prevsum=nums[0];
            int max=Integer.MIN_VALUE;

            for(int i=1;i<nums.length;i++)
            {
                currentsum=prevsum+nums[i];
                if(currentsum<nums[i])
                {
                    prevsum=nums[i];
                }else
                {
                    prevsum=currentsum;
                }

                if(prevsum>max)
                {
                    max=prevsum;
                }
            }
            return max;
        }
}


