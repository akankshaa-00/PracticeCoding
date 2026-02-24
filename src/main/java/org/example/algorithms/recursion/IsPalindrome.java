package org.example.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(ifpalindrome(4561654));
    }

    public static boolean ifpalindrome(int n)
    {
        List<Integer> arr=new ArrayList<>();
        while(n!=0)
        {
            arr.add(n%10);

            n=n/10;
        }
        int start=0;
        return helper(arr,start,arr.size()-1);

    }

    public static boolean helper(List<Integer> list,int start,int end)
    {
        if(start>end)
        {
            return true;
        }
        else if(list.get(start).equals(list.get(end)))
        {
            return false;
        }
            return helper(list,start+1,end-1);
    }
}
