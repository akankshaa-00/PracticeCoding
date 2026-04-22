package org.example.streams;

import java.util.Arrays;

public class FlattenList {

    public static void main(String[] args) {
//        Flatten list of lists
//        [[1,2],[3,4]] → [1,2,3,4]
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        flattenlist(arr);
    }


    public static void flattenlist(int[][] ar)
    {
        Arrays.stream(ar)
                .flatMapToInt(Arrays::stream)
                .forEach(System.out::println);
    }
}
