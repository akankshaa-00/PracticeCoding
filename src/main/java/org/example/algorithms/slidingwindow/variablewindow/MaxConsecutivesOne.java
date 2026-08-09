package org.example.algorithms.slidingwindow.variablewindow;

import java.util.HashMap;

public class MaxConsecutivesOne {

    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(returnmaxSubstringLength(arr,k));
    }

    public static int returnmaxSubstringLength(int[] ar,int k) {

        //Decide on ds..can use Hashmap for storing 1 & 0 frequency
        HashMap<Integer,Integer> map=new HashMap<>();
        int bestlength=0;
        int l=0;
        for(int r=0;r<ar.length;r++)
        {
            map.put(ar[r],map.getOrDefault(ar[r],0)+1);
            //Shrink when invalid
            while(map.containsKey(0) && map.get(0)>k)
            {
                map.put(ar[l],map.getOrDefault(ar[l],0)-1);
                l++;
            }
            //store when valid
            bestlength=Math.max(bestlength,r-l+1);
        }
        return bestlength;
    }
}
