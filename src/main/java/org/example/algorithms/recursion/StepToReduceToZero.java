package org.example.algorithms.recursion;

public class StepToReduceToZero {

    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
    public static void main(String[] args) {
        System.out.println(stepsCount(14));
        //Output: 6
        //In one step, if the current number is even, you have to divide it by 2,
        // otherwise, you have to subtract 1 from it.
    }

    public static int stepsCount(int n)
    {
        int count=0;

        return helper(n,count);
    }

    public static int helper(int n, int count)
    {
        if(n==0)
        {
            return count;
        }
        else if (n%2==0){
            return helper(n/2,++count);
        }else{
            return helper(n-1,++count);
        }
    }
}
