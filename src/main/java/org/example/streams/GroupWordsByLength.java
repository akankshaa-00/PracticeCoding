package org.example.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {

    public static void main(String[] args) {
//        3. Group words by length
//        ["hi","hello","bye"] → {2:[hi],3:[bye],5:[hello]}
        String[] words=new String[]{"hi","hello","bye"};
        returnWordLengthGroup(words);

    }

    public static void returnWordLengthGroup(String[] words)
    {
        Map<Integer, List<String>> map= Arrays.stream(words)
                .collect(Collectors.groupingBy(String::length));

        System.out.println(map);
    }
}
