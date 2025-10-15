package org.example.algorithms;

public class MaximumSumSubarray {
    //Given an array of integers arr[] and a number k, find the maximum sum of any contiguous subarray
    // of size k.
    public static void main(String[] args) {
        int[] arr={2,6,1,3,9,0,4,2,7,1,1};
        int k=3;
        slidingWindow(arr,k);
    }
    public static void slidingWindow(int[] arr,int k){


        int windowsum=0;
        int sum=0;

        for(int i=0;i<=k-1;i++)
        {
            windowsum += arr[i];
        }
        System.out.println(windowsum);
        sum=windowsum;

        for(int end=1;end<=arr.length-k;end++)
        {
            windowsum=(windowsum-arr[end-1])+arr[(end+k)-1];
            System.out.println(windowsum);
            if(windowsum>sum)
            {
                sum=windowsum;
            }
        }
        System.out.println(sum+" is the largest sum of contiguous subarray of k size");
    }

}
