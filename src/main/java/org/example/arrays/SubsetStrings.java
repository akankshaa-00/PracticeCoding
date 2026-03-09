package org.example.arrays;

import java.util.ArrayList;

public class SubsetStrings {

    public static void main(String[] args) {
        subset("abc");
    }

    public static void subset(String a)
    {
        ArrayList<String> lis=new ArrayList<>();
        lis.add("");
        while(!a.isEmpty())
        {
            char c = a.charAt(0);
            int lisSize= lis.size();
            for(int i=0;i<lisSize;i++)
            {
                lis.add(lis.get(i)+c);
            }
            a = a.substring(1);
        }
        System.out.println(lis.toString());
    }
}
