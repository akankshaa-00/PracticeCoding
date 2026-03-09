package org.example.algorithms.recursion;

public class printsubsetAscii {

    public static void main(String[] args) {
        print("","ab");
    }

    public static void print(String a,String ab)
    {
        if(ab.isEmpty())
        {
            System.out.println(a);
            return;
        }
        char c=ab.charAt(0);

        print(c+a,ab.substring(1));
        print(a,ab.substring(1));
        print(a+(c+0),ab.substring(1));
    }
}
