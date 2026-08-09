package org.example.algorithms.slidingwindow.variablewindow;

import java.util.HashMap;

public class LongestSubstrngWithMostKCharacters {

    public static void main(String[] args) {
        String str="sabbbbfbfbjsiawief";
        int k=5;
        System.out.println(returnsubstring(str,k));
    }

    public static int returnsubstring(String str,int k) {
        //First decide ds to store & slide data in windows
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int bestlength=0;
        for(int r=0;r<str.length();r++)
        {
            //store in ds
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r),0)+1);
            //shrink until valid
            while(map.keySet().size()>k)
            {
                map.put(str.charAt(l), map.getOrDefault(str.charAt(l),0)-1);
                if(map.get(str.charAt(l))==0)
                {
                    map.remove(str.charAt(l));
                }
                l++;
            }
            //Now when the winodw is valid store the ans
            bestlength=Math.max(r-l+1,bestlength);
        }
        return bestlength;
    }


}
