package org.example.algorithms;

public class FirstNegativeINSubArraySizeK {

    public static void main(String[] args) {
        int[] arr={12, -1, -7, 8, -15, 30, 16, 28};
        int k=3;
    }

    public static void slidingwindow(int[] arr,int k) {


        for(int i=0;i<k;i++)
        {
            if(arr[i]<0)
            {
                System.out.println(arr[i]);
                break;
            }
        }
        int j=0;
        while(j<arr.length)
        {
            for(int t=j;t<t+k;t++)
            {
                if(arr[k]<0)
                {
                    System.out.println(arr[k]);
                    j++;
                    break;
                }
            }

        }
    }
}
