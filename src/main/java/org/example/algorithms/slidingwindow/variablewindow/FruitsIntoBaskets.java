package org.example.algorithms.slidingwindow.variablewindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {

    public static void main(String[] args) {
        // Given an array of fruits, find the longest contiguous
        // subarray containing at most 2 distinct types.

        int[] arr = {1,2,1,2,3,2,2};
        System.out.println(maxFruits(arr));
    }

    public static int maxFruits(int[] ar) {
    //Figure out ds to save and slide eac window answer
        HashMap<Integer,Integer> map=new HashMap<>();
        int bestlength=0;
        int l=0;
        for(int r=0;r<ar.length;r++)
        {
            //expand window
            map.put(ar[r],map.getOrDefault(ar[r],0)+1);
            //shrink until valid
            while(map.keySet().size()>2)
            {
                map.put(ar[l],map.getOrDefault(ar[l],0)-1);
                if(map.get(ar[l])==0)
                {
                    map.remove(ar[l]);
                }
                l++;
            }
            //store ans when valid
            bestlength= Math.max(bestlength,r-l+1);

        }
        return bestlength;
    }
}
