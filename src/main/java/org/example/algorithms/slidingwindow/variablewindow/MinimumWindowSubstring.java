package org.example.algorithms.slidingwindow.variablewindow;

import java.util.HashMap;

public class MinimumWindowSubstring {

    public static void main(String[] args) {
       String s = "ADOBECODEBANC";
       String t = "ABC";

        System.out.println(returnSmallestSubstring(s,t));

       //Find the smallest substring of s that contains all
        // characters of t, including the required frequencies.
    }

    public static int returnSmallestSubstring(String s,String t) {

        //expand until win contains all
        //when win contains all-start shrinking until win is valid
        //save the shortest length
        //increase l to find another substring

        //first storing frequencies of string t in a HashMap
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:t.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //Now compare with windows from input string s
        HashMap<Character,Integer> mapWindow=new HashMap<>();
        int bestlength=Integer.MAX_VALUE;
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            //expand until window is valid
            char c=s.charAt(r);
            mapWindow.put(c,mapWindow.getOrDefault(c,0)+1);

            //checking for valid window
            while(iswindowvalid(map,mapWindow)) {
                bestlength=Math.min(bestlength,r-l+1);

                    mapWindow.put(s.charAt(l), mapWindow.getOrDefault(s.charAt(l), 0) - 1);
                    l++;
                }


        }
        return bestlength;
    }

    public static boolean iswindowvalid(HashMap<Character,Integer> map,HashMap<Character,Integer> win) {
        for(char c: map.keySet())
        {
            if(win.containsKey(c) && win.get(c)>=map.get(c))
            {
            }else{
                return false;
            }
        }
        return true;
    }
}
