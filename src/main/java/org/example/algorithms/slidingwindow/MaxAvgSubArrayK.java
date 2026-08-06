package org.example.algorithms.slidingwindow;

public class MaxAvgSubArrayK {

    public static void main(String[] args) {
        int[] ar={2,1,5,6,3,9};
        System.out.println(maxAvg(ar,2));
    }

    public static double maxAvg(int[] ar,int k) {
        //starting with taking l & r pointers bcs sliding window
        int l=0;
        int cursum=0;
        double result=0;
        for(int r=0;r<ar.length;r++)
        {

            if((r-l+1)<=k)
            {
                cursum+=ar[r];
                if(r-l+1==k)
                {
                    result=Math.max(cursum/k,result);
                    cursum-=ar[l];
                    l++;
                }
            }
        }
        return result;
    }
}
