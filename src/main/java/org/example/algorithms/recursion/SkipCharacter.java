package org.example.algorithms.recursion;

public class SkipCharacter {

    public static void main(String[] args) {
        //String ans=skip("baccdea");
        String ans=skipWord("bacdeappkjhdapplehuubegapple");
        System.out.println(ans);
    }

    public static String skip(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }

        char c=str.charAt(0);

        if(c=='a')
        {
            return skip(str.substring(1));
        }else {
            return c + skip(str.substring(1));
        }
    }

    public static String skipWord(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }

        if(up.startsWith("apple"))
        {
            return skipWord(up.substring(5));
        }else {
            return up.charAt(0) + skipWord(up.substring(1));
        }
    }
}
