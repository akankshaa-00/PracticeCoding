package org.example.algorithms.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllIndex {
    public static void main(String[] args) {
        int[] arr={2,8,6,2,3,4,5,6,2};
        System.out.println( returnindexes(arr,2,0));
    }

    public static List<Integer> returnindexes(int[] arr,int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length)
        {
            return list;
        }

        if(arr[index]==target)
        {
            list.add(index);
        }
        list.addAll(returnindexes(arr,target,index+1));
        return list;
    }
}
