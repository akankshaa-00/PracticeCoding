package org.example.HashMapStreams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        //Return the first non-repeating character in a string.
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        String s = "swisswolujhhukloijhug";

        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        Character c=map.entrySet()
                .stream()
                .filter(b->b.getValue()==1)
                .map(a->a.getKey())
                .findFirst().orElse(null);
        System.out.println(c);

    }
}
