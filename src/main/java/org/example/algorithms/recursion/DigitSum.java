package org.example.algorithms.recursion;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sum(87));
    }

    public static int sum(int n){
        if(n<=1)
        {
            return n;
        }
        int ld=n%10;
        return ld+sum(n/10);
    }
}
