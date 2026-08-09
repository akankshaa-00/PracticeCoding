package org.example.algorithms.slidingwindow.variablewindow;

import java.util.HashMap;

public class LongstSubstrngWithAtMostDistinctCharac {

    public static void main(String[] args) {
        String s="abcdasiouytsppodkwokd";
        System.out.println(longestSubstrng(s));
    }

    public static int longestSubstrng(String s) {
        //think what we will take to next window from previous
        //is hashmap even needed?
        //yes
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int bestLength=0;
        for(int r=0;r<s.length();r++)
        {
            //expand window
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);

            //shrink until valid
            while(map.get(s.charAt(r))>1)
            {
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            //Store ans when window is valid
            if(r-l+1>bestLength)
            {
                bestLength=r-l+1;
            }

        }
        return bestLength;
    }
}
