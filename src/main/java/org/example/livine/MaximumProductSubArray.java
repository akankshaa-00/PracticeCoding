package org.example.livine;

public class MaximumProductSubArray {

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++) {

            int curr = nums[i];

            if(curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(curr,
                    maxProd * curr);

            minProd = Math.min(curr,
                    minProd * curr);

            result = Math.max(result,
                    maxProd);
        }

        return result;
    }
}
