package org.example.HashMapStreams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMap {

    //Sort a Map by Its Values (Descending Order)
    //{Apple=50, Banana=80, Mango=30} →
    //Output: Banana=80, Apple=50, Mango=30

    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Apple",50);
        map.put("Banana",80);
        map.put("Mango",30);

        map.entrySet().stream()
                .sorted((o1,o2)->o2.getValue()-o1.getValue()).forEach(System.out::println);
    }

}
