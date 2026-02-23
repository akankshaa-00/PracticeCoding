package org.example.algorithms.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(findnthfibonacci(50));

        }


    public static int findnthfibonacci(int n)
    {
        if(n<2)
        {
            return 1;
        }
        return findnthfibonacci(n-1)+findnthfibonacci(n-2);
    }
}
