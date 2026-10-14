package org.example.stringsManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static void main(String[] args) {


        String str = "hello world java";
        //answer= "java world hello"

        System.out.println(completeReverse(str));
        reverseBySpace(str);
        System.out.println(reverseSplit(str));
        System.out.println(CollectionReverse(str));
        System.out.println(reverseEachWordAtPlace(str));
    }

    public static String completeReverse(String s) {
        StringBuilder ans = new StringBuilder(s.length());

        for (int i = s.length()- 1; i>=0; i--)
        {
            ans.append(s.charAt(i));
        }
        return new String(ans);
    }

    public static void reverseBySpace(String s) {
        int lastIndex=s.length();
        StringBuilder ans = new StringBuilder(s.length());
        for (int i = s.length()- 1; i>=0; i--)
        {
            if(s.charAt(i)==' ' || i==0)
            {
                if(i==0)
                {
                    ans.append(s.substring(i,lastIndex));
                }else{
                    ans.append(s.substring(i+1,lastIndex));
                }
                ans.append(' ');
                lastIndex=i;
            }
        }
        System.out.println(ans);
    }

    public static String reverseSplit(String s) {
        String[] sar=s.split(" ");
        StringBuilder ans=new StringBuilder();

        for (int i=sar.length-1;i>=0;i--)
        {
            ans.append(sar[i]);
            ans.append(' ');
        }
        return new String(ans).trim();

    }

    public static String CollectionReverse(String s) {

        List<String> words= Arrays.asList(s.split(" "));

         Collections.reverse(words);
         return words.toString();

    }

    public static String reverseEachWordAtPlace(String s) {
        String[] sar=s.split(" ");
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<sar.length;i++)
        {
            String word=sar[i];
            for(int j=word.length()-1;j>=0;j--)
            {
                ans.append(word.charAt(j));
            }
            ans.append(" ");
        }
        return new String(ans).trim();
    }
}
