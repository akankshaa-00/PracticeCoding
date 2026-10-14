package org.example.arrays;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
//      Group strings that contain the same characters in any order.
//      strs = ["eat","tea","tan","ate","nat","bat"] → [["eat","tea","ate"],["tan","nat"],["bat"]]
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char[] sCharArray = s.toCharArray();
            Arrays.sort(sCharArray);
            String p=new String(sCharArray);
            if(map.containsKey(p))
            {
                map.get(p).add(s);
            }else{
                map.put(p, new ArrayList<>(List.of(s)));            }
        }

        System.out.println(map.values());


    }
}
