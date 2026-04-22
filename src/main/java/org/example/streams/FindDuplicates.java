package org.example.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
//        7. Find duplicates in list
//        Return only duplicates (not count)

        int[] ar={2,5,6,7,8,0,1,1,5};
        finddup(ar);

    }

    public static void finddup(int[] ar)
    {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int a:ar)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
       map.entrySet().stream().filter(a->a.getValue()>1).map(c->c.getKey()).forEach(System.out::println);
    }
}
