package org.example.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequency {

    public static void main(String[] args) {
        //Input[1,2,2,3,3,3]Output: {1=1, 2=2, 3=3}
        int[] arr={1,2,2,3,3,3};
        printfrq(arr);
    }

    public static void printfrq(int[] ar)
    {
        Map<Integer,Long> freqmap=Arrays.stream(ar).boxed().collect(Collectors.groupingBy(i->i ,Collectors.counting()));

        System.out.println(freqmap);
    }
}
