package org.example.arrays;

import java.util.Arrays;

public class ProductOfArrayLeavingItself {

    public static void main(String[] args) {
        int[] ar={3,1,4,5,3,1,2,3,4,5};
        for (int i=0;i< ar.length;i++)
        {
            System.out.println(findProdarr(ar)[i]);
        }
    }

    public static int[] findProdarr(int[] ar) {
        int[] ans=new int[ar.length];
        int[] left=new int[ar.length];
        int[] right=new int[ar.length];
        int leftprod=1;
        int rightprod=1;
        left[0]=1;
        right[ar.length-1]=1;
        for(int i=1;i< ar.length;i++)
        {

            leftprod=leftprod*ar[i-1];
            left[i]=leftprod;
        }
        for(int j=ar.length-2;j>=0;j--)
        {
            rightprod=rightprod*ar[j+1];
            right[j]=rightprod;
        }
        for(int k=0;k< ar.length;k++)
        {
            ans[k]=left[k]*right[k];
        }
        return ans;
    }
}
