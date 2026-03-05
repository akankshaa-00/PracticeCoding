package org.example.algorithms.recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr={2,8,1,5,7};
        sort( arr, 0,arr.length-1,0);
    }

    public static void sort(int[] arr,int index,int targetindex,int largestelement)
    {
        if(targetindex==0)
        {
            System.out.println(Arrays.toString(arr));
        }

        if(index==targetindex)
        {
            swap(arr,largestelement,targetindex);
             sort(arr,0,targetindex-1,0);
        } else if(index<targetindex)
        {
            if(arr[index]>arr[largestelement]) {
                largestelement = index;
            }

             sort(arr,index+1,targetindex,largestelement);
        }

    }

    private static void swap(int[] arr, int largestin, int targetindex) {
        int temp=arr[largestin];
        arr[largestin]=arr[targetindex];
        arr[targetindex]=temp;
    }
}
