package org.example.algorithms.recursion;

public class PhoneNumberPermutations {
    public static void main(String[] args) {
        permutation("","12");
    }

    public static void permutation(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        int first=((up.charAt(0)-'0')-1)*3;
        for(int i=0;i<3;i++)
        {
            permutation(p+(char)('a'+first+i),up.substring(1));
        }


    }
}
