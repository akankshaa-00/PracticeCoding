package org.example.algorithms.slidingwindow.variablewindow;

public class LongestSubArrayWithSumK {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 7;

        System.out.println(returnWindowSize(arr,k));
    }

    public static int returnWindowSize(int[] arr,int k) {
        //store sum in int datatype
        int wincount=0;
        int bestlength=0;
        //expand until invalid
        int l=0;
        for(int r=0;r< arr.length;r++)
        {
            wincount+=arr[r];

            while(wincount>k)
            {
                wincount-=arr[l];
                l++;
            }
            bestlength=Math.max(bestlength,r-l+1);
        }
        return bestlength;
    }
}
