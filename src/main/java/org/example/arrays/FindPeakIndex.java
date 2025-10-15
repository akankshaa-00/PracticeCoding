package org.example.arrays;

public class FindPeakIndex
{

    public static int findpeakelement(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String args[])
    {
        int[] arr={4,6,9,2,1,0};

        int peakIndex=findpeakelement(arr);

        System.out.println("PeakIndex is "+peakIndex);
    }
}
