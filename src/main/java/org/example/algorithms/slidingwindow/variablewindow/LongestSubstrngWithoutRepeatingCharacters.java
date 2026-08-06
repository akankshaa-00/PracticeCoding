package org.example.algorithms.slidingwindow.variablewindow;

import java.util.HashMap;

public class LongestSubstrngWithoutRepeatingCharacters {
    public static void main(String[] args) {
        //Longest substring w/o repeating characters
        //will use sliding window with 2 pointers bcs substring
        //need something to store the win stage for chara
        //can save in HashMap

        String s="saohuggvdwwon";
        System.out.println(longestSubstring(s));
    }

    public static String longestSubstring(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        String ans = "";
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
            while(map.get(s.charAt(r))>1)
            {
                //invalid window
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            if((r-l)+1>ans.length()) {
                ans = s.substring(l, r+1);
            }
        }
        return ans;
    }
}
