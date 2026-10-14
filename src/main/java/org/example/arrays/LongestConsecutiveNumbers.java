package org.example.arrays;
import java.util.Arrays;
import java.util.Map;

public class LongestConsecutiveNumbers {

    public static void main(String[] args) {
//        1. Longest Consecutive Sequence
//        Find the length of the longest consecutive sequence in an unsorted array.
//        nums = [100,4,200,1,3,2] → 4
        int[] nums={100,4,200,1,3,2};
        System.out.println(cons(nums));
    }

    public static int cons(int[] nums)
    {
        int c=1;
        int maxc=1;
        //first sort the array
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                continue;
            }
            if(nums[i]-nums[i-1]==1)
            {
                c++;
            }else{
                c=1;
            }
            maxc= Math.max(maxc,c);
        }
        return maxc;
    }
}
