package org.example.streams;

import java.util.Arrays;

public class TopKLargestNumbers {

//    Find top K largest numbers
//    Use streams (no sorting whole array ideally)

    public static void main(String[] args) {
        int[] ar=new int[]{2,7,4,5,9,7};
        returnKlargestNumber(ar,2);
    }

    public static void returnKlargestNumber(int[] ar,int k)
    {
        Arrays.stream(ar)
                .boxed()
                .sorted((a,b)->b-a)
                .limit(k)
                .forEach(System.out::println);
    }


}
