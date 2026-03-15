package org.example.algorithms.recursion;

public class DicePermutation {

    public static void main(String[] args) {
        diceperm("",4);
    }

    public static void diceperm(String p,int tar)
    {
        if(tar==0)
        {
            System.out.println(p);
            return;
        }

        for(int i=1;i<=tar;i++)
        {
            diceperm(p+i,tar-i);
        }


    }

}
