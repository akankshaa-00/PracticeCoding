package org.example.algorithms.slidingwindow;

public class MinSumSubArrayK {

    public static void main(String[] args) {
        int[] ar={2,1,5,6,3,9,0,1};
        System.out.println(minSum(ar,2));
    }

    public static int minSum(int[] ar,int k)
    {
        int l=0;
        int curSum=0;
        int ans=Integer.MAX_VALUE;
        for(int r=0;r<ar.length;r++)
        {
            curSum+=ar[r];
            if((r-l)+1==k)
            {
                ans=Math.min(ans,curSum);
                curSum-=ar[l];
                l++;
            }
        }

        return ans;
    }
}
