package org.example.algorithms.recursion;

public class IsArraySorted {

    public static void main(String[] args) {
        int[] ar={2,3,4,5,10,7};
        System.out.println(isSorted(ar));
    }
    public static boolean isSorted(int[] arr)
    {
        int s=0;
       return helper(arr,s);
    }

    public static boolean helper(int[] arr,int s){
        int end=arr.length-1;
        if(s==end)
        {
            return true;
        }
        if(arr[s]>arr[s+1])
        {
            return false;
        }
        return helper(arr, s+1);
    }
}
