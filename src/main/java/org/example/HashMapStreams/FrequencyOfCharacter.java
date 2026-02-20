package org.example.HashMapStreams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {

    //Given a string, find how many times each character occurs (case-sensitive).
    public static void main(String[] args) {
        String s = "banana";
        HashMap<Character,Integer> map=new HashMap<>();

//        for(int i=0;i<s.length();i++)
//        {
//            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//        }

        System.out.println(map);
        Map<Character,Long> mao=s.chars().
                mapToObj(c->(char) c).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
