package org.example.streams;

import java.util.HashMap;

public class NonRepeatingCharacter {

    public static void main(String[] args) {
//        First non-repeating character in a string
//        "aabbcde" → c
        String str="aabbcde";
        System.out.println(returnchar(str));
    }

    public static Character returnchar(String s)
    {
        HashMap<Character,Integer> frq=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            frq.put(s.charAt(i),frq.getOrDefault(s.charAt(i),0)+1);
        }

        return frq.entrySet()
                .stream()
                .filter(c->c.getValue()==1)
                .map(c->c.getKey())
                .findFirst()
                .orElse(null);
    }


}
