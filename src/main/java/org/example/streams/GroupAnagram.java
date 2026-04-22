package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagram {

    public static void main() {
//        Group anagrams
//        ["eat","tea","tan","ate","nat"]

        String[] ar={"eat","tea","tan","ate","nat"};
        returnGroup(ar);


    }

    public static void returnGroup(String[] words)
    {
        Map<String, List<String>> map =
                Arrays.stream(words)
                        .collect(Collectors.groupingBy(word -> {
                            char[] ch = word.toCharArray();
                            Arrays.sort(ch);
                            return new String(ch);
                        }));
        System.out.println(map.values());
    }
}
