package org.example.arrays;

import java.util.HashMap;

public class LongestSubstringRepeatingChar {

//    Find the longest substring containing no repeated characters.
//    s = "abcabcbb" → 3

    public static void main(String[] args) {
        String s="abcabcbb";

        int l=0;
        int r=0;
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<s.length()) {
                char c = s.charAt(r);
                map.put(c, map.getOrDefault(c, 0) + 1);
                if (map.get(c) > 1) {
                    while (map.get(c) != 1)
                    {
                        map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                        l++;
                    }
                }
                ans = Math.max(ans, r - l + 1);
                r++;

        }
        System.out.println(ans);
    }
}
