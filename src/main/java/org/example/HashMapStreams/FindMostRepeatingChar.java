package org.example.HashMapStreams;

import java.util.HashMap;
import java.util.Map;

public class FindMostRepeatingChar {

    public static void main(String[] args) {

        //s = "banana" → Output: 'a'
        String s="bananannnnn";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        Character r=map.entrySet()
                .stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse(null);

        System.out.println(r);

    }
}
