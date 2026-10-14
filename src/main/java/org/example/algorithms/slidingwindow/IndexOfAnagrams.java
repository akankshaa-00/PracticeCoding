package org.example.algorithms.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOfAnagrams {

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        //sliding window
        char[] arp = p.toCharArray();
        Arrays.sort(arp);
        int l = 0;

        List<Integer> ans = new ArrayList<>();
        StringBuilder win = new StringBuilder();
        char[] ars = s.toCharArray();
        for (int r = 0; r < s.length(); r++) {
            win.append(ars[r]);
            if (win.length() > arp.length) {
                //invalid window-remove left
                win.deleteCharAt(0);
                l++;
            }
            char[] tempwin=win.toString().toCharArray();
            Arrays.sort(tempwin);
            //when valid -- check if anagram
            if (Arrays.equals(tempwin,arp)) {
                ans.add(l);
            }
        }
        return ans;
    }
}