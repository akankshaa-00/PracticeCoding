package org.example.algorithms;

public class Palindrome {

    public static void main(String[] args) {
        String s="malayalam";
         boolean is=ispalindrome(s);
         System.out.println(is);

    }

    public static boolean ispalindrome(String s) {

        int l=0;
        int r=s.length()-1;

        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
