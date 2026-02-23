package org.example.algorithms.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] ar={2,3,4,5,6,7,99,5,43,21};
        System.out.println(6 +" is present at index: " + search(ar,0,ar.length-1,43));
    }

    public static int search(int[] arr,int left,int right,int target){
        int mid=(left+right)/2;
        if(arr[mid]==target)
        {
            return mid;
        }

        if(arr[mid]<target)
        {
            return search(arr,mid+1,right,target);
        }else{
            return search(arr,left,mid-1,target);
        }
    }
}

