package org.example.arrays;

public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        //nums = [3,4,5,1,2]
        //nums = [1,2,3,4,5]
        //nums= [3,4,5,6,7,8]
        //nums= [5,4,1,2,3]
        //Answer:- 1
        int[] nums={3,4,5,6,7,8};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int mid=0;

        while(l<r)
        {
            mid=(l+r)/2;
            if(nums[mid]<nums[r]) //if mid is lesser than end ,means
            {
                r=mid;
            }else
            {
                l=mid+1;
            }
        }
        return l;
    }
}
