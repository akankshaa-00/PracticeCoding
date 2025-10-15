package org.example;


import static org.example.arrays.FindPeakIndex.findpeakelement;

public class Main {
    public static void main(String[] args) {


        System.out.println(String.format("Hello and welcome!"));

        int[] arr={4,6,9,2,1,0};

        int peakIndex=findpeakelement(arr);

        System.out.println("PeakIndex is "+peakIndex);
    }
}
