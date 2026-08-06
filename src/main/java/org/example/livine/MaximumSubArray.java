package org.example.livine;

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] nums={5,4,-1,7,8};
        System.out.println(findmaxSum(nums));
    }

    public static int findmaxSum(int[] arr) {
        int lastSum=0;
        int newSum=0;
        int largestSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            newSum=lastSum+arr[i];

            if(newSum<arr[i]) //then start fresh
            {
                lastSum=arr[i];
                newSum=arr[i];
            }
            else{ //continue with lastsum
                lastSum=newSum;
            }
            if(largestSum<newSum) //Always check largestSum
            {
                largestSum=newSum;
            }
        }
        return largestSum;
    }
}
