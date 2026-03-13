package org.example.algorithms.recursion;

public class Permutation {

    public static void main(String[] args) {
        print("","abc");
    }

    public static void print(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char c=up.charAt(0);
        for(int i=0;i<p.length();i++)
        {
            String first=p.substring(0,i);
            String last=p.substring(i,p.length());

            print(first+c+last,up.substring(1));
        }
    }
}
