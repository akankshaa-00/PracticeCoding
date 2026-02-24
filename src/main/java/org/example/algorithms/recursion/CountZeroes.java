package org.example.algorithms.recursion;

public class CountZeroes {

    public static void main(String[] args) {
        System.out.println(countzero(9804503));
    }

    public static int countzero(int n)
    {
        int count=0;
        return helper(n,0);
    }

    public static int helper(int n,int count){
        if(n == 0)
        {
            return count;
        }

        if(n%10 == 0)
        {
            count++;
        }
        return helper(n/10,count);
    }
}
