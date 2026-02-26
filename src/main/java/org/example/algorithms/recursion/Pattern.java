package org.example.algorithms.recursion;

public class Pattern {

    public static void main(String[] args) {
        //pattern1(5);
        //pattern1anotherway(4,1);
        triangle2(4,1);
    }

    public static void pattern1(int n){
        if(n==0)
        {
            return;
        }

        for(int i=1;i<=n;i++)
        {
            System.out.print("* ");
        }
        System.out.println();
        pattern1(n-1);
    }

    public static void pattern1anotherway(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if (c<r)
        {
            System.out.print("*");
            pattern1anotherway(r,c+1);
        } else if(c==r) {
            System.out.print("*");
            System.out.println();
            pattern1anotherway(r-1,1);
        }
    }

    public static void triangle2(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if (c<r)
        {
            pattern1anotherway(r,c+1);
            System.out.print("*");
        } else if(c==r) {
            pattern1anotherway(r-1,1);
            System.out.print("*");
            System.out.println();
        }
    }
}
