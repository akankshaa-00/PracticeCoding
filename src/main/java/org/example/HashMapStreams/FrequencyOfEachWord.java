package org.example.HashMapStreams;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyOfEachWord {

    //Given a string paragraph, count the frequency of each word and print them in
    // descending order of frequency.
//String text = "Java is great and Java is fun";
//    Java -> 2
//    is -> 2
//    great -> 1
//    and -> 1
//    fun -> 1

    public static void main(String[] args) {

        String text = "Java is great and Java is fun";
        String[] arr=text.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        int i=0;
        while(i<arr.length)
        {
            map.put(arr[i].toLowerCase(),map.getOrDefault(arr[i],0)+1);
            i++;

        }
        System.out.println(map.entrySet());
    }


}
