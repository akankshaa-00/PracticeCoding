package org.example.algorithms;

import java.util.Arrays;

public class MoveAllZeroesToEnd {

    public static void main(String[] args) {
        int[] arr={0,1,2,0,3};
        int[] ans=twopointerstable(arr);
        Arrays.stream(ans).forEach(System.out::print);
    }

    public static int[] twopointerunstable(int[] arr) {
        int l=0;
        int r=arr.length-1;

        while(l<r)
        {
            if(arr[l]==0)
            {
                if(arr[r]!=0)
                {
                    swap(arr,l,r);
                }else{
                    r--;
                }
            }else{
                l++;
            }
        }
        return arr;
    }

    public static int[] swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

        return arr;
    }

    public static int[] twopointerstable(int[] arr) {
        int start=0;

        for(int r=0;r<arr.length;r++)
        {
             if(arr[r]!=0)
             {
                 swap(arr,r,start);
                 start++;
             }
        }
        return arr;
    }
}
