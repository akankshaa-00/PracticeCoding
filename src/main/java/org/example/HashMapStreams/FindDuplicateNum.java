package org.example.HashMapStreams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNum {

    public static void main(String[] args) {
//        Given a list of integers, find all elements that appear more than once.
//        [1,2,3,4,2,3,5,1] → Output: [1,2,3]

        int[] ar={1,2,3,4,2,3,5,1};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<ar.length;i++)
        {
            map.put(ar[i],map.getOrDefault(ar[i],0)+1);
        }

        map.entrySet().stream().filter(c->c.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
    }
}
