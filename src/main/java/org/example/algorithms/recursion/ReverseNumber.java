package org.example.algorithms.recursion;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println( reverse2(1273));
    }

    public static int reverse1(int n,int rev)
    {
        if(n%10==n)
        {
            return n;
        }
        rev = (n%10)*10;
        return rev + reverse1(n%10,rev);
    }

    public static int reverse2(int n){
       return helper(n,0);
    }

    public static int helper(int n,int rev) {
        if (n==0) {
            return rev;
        }

        rev = (rev * 10) + n % 10;
        return helper(n / 10, rev);
    }


}
