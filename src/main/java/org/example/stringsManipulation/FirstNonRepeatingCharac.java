package org.example.stringsManipulation;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatingCharac {

    public static void main(String[] args) {
        String s="bdubqdb";
        //store frequency in hashmap
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(Character c:map.keySet())
        {
            if(map.get(c)==1)
            {
                System.out.println(c);
                break;
            }
        }
    }
}
