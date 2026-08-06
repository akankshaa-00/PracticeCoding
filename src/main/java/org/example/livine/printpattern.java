package org.example.livine;

public class printpattern {

    public static void main(String[] args) {
        //1 2 2 3 3 3 4 4 4 4
        print(4);
        pattern2(4);
        pattern3(4);
    }

    public static void print(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
        }
    }

    public static void pattern2(int n)
    {
//        1
//        22
//        333
//        4444

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
