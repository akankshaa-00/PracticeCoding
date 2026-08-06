package org.example.algorithms.slidingwindow.variablewindow;

import java.util.Collections;
import java.util.HashMap;

public class LongestRepeatingAfterKReplacement {

    public static void main(String[] args) {
        //Need to find longest character with all same char when replaced K elements
        String s="AAVACCCSUG";
        System.out.println(findlongest(s,1));
    }

    public static int findlongest(String s,int k) {
        //Following sliding window
        //Expand
        //If window= invalid
        //Shrink until window is valid again
        //I think will need MAP here-for storing frequencies
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int max=0;
        int ans=0;
        for(int r=0;r<s.length();r++)
        {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            //Incase invalid
             max= Math.max(map.get(s.charAt(r)),max);
            while((r-l+1)-max>k)
            {
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
