package org.example.arrays;

public class SubArraySumEqualsK {

    public static void main(String[] args) {
//        3. Subarray Sum Equals K
//        Count the continuous subarrays whose sum equals k. Numbers can be negative.
//        nums = [1,2,3], k = 3 → 2

        int[] nums={1,2,3,4,5,6};
        int k=3;
        System.out.println(noOfSubarrays(nums,k));
    }

    public static int noOfSubarrays(int[] nums, int k) {
        int l = 0, sum = 0, count = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while (sum > k && l <= r) {
                sum -= nums[l];
                l++;
            }

            if (sum == k) {
                count++;
            }
        }

        return count;
    }
}
