package org.example.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoPointer {

    public static void main(String[] args) {
        int[] arr={2,5,7,4,9,6,19,3,8,18,20};
        int k=20;

        int[] ans=isSumPresent(arr,k);
        System.out.println(ans[0]+ " "+ans[1]);
    }

    public static int[] isSumPresent(int[] arr,int k) {
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(a-> System.out.print(a));
        int[] ans={0,0};
        int l=0;int r=arr.length-1;

        while(l<r)
        {
            if(arr[l]+arr[r]==k)
            {
                ans[0]=l;
                ans[1]=r;
                return ans;
            }
            else if(arr[l]+arr[r]<k)
            {
                l++;
            }else{
                r--;
            }
        }

        return ans;
    }
}
