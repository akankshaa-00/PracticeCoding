package org.example.stringsManipulation;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {
        String s="uhqbdyvwqyv";
    }

    public static void retString(String s) {
        //sliding-window
        //store in hashmap -each window frequency
        HashMap<Character,Integer> map=new HashMap<>();

        //start loop
        //expand window
        //keep saving each char into hashmap and there freq
        //after each save -check if the current char freq is >1
        //move l until the window is valid again
        //before ending loop ,keeep saving bestlength for valid win

    }
}
