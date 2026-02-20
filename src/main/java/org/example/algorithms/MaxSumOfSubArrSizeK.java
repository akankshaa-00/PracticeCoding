package org.example.algorithms;

public class MaxSumOfSubArrSizeK {

    public static void main(String[] args) {
        int[] arr= {2, 1, 5, 1, 3, 2};
        int k = 3;

        slidingwindow(arr,k);
    }

    public static void slidingwindow(int[] arr,int k){

        int maxSum=0;
        int windowSum=0;
        for(int i=0;i<k;i++)
        {
            windowSum+=arr[i];
        }
        maxSum=windowSum;

        for(int i=1;i<=(arr.length-k);i++)
        {
            windowSum=(windowSum-arr[i-1])+arr[(i+k)-1];
            if(windowSum>maxSum)
            {
                maxSum=windowSum;
            }

        }


        System.out.println("Max Sum is "+maxSum);
    }
}
