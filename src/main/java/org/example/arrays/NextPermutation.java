package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {

    public static void main(String[] args) {
        //https://takeuforward.org/data-structure/next_permutation-find-next-lexicographically-greater-permutation
        int[] arr={1,2,3};
        returnNextPermutation(arr);
    }

    public static void returnNextPermutation(int[] arr){
        List<Integer> list=new ArrayList<>();

        for(int a: arr)
        {
            list.add(a);
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<arr[i+1])
            {

            }
        }


    }
}
