package org.example.HashMapStreams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListByLength {


    //Group a list of strings by their lengths
    //Example: ["hi","hello","yes","no"] → {2=[hi,no], 3=[yes], 5=[hello]}

    public static void main(String[] args) {

        List<String> words = Arrays.asList("hi", "hello", "yes", "no");

        Map<Integer,List<String>> length=words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(length);
    }
}
