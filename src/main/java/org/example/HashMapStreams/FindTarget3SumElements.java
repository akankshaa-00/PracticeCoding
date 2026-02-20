package org.example.HashMapStreams;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class FindTarget3SumElements {
    //You have given an input array = {12, 3, 4, 1, 6, 9}, target sum = 24, output (3,9,12) 3 + 9 +12 = 24
    public static void main(String[] args) {
        int[] input={12, 3, 4, 1, 6, 9};
        int targetsum=24;
        findtriplet(input,targetsum);

    }

    static void findtriplet(int[] in, int target)
    {
        //Solving through simple for loop
        Arrays.sort(in);
        for(int i=0;i<in.length-1;i++)
        {
            int left=i+1;
            int right=in.length-1;
            while(left<right)
            {
                int sum = in[i] + in[left] + in[right];
                if (sum == target) {
                    System.out.println("The triplet answer is " + in[i] +","+ in[left]+"," + in[right]);
                    return;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
                sum=0;
            }

        }

    }


}
