//package org.example.algorithms;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class LongestSubstrDistinctChar {
//
//    //Given a string s and an integer k, find the length of the longest substring that
//    //contains at most k distinct characters.
//    public static void main(String[] args) {
//        String s = "eceba";
//        int k = 2;
//
//        slidingwindow(s,k);
//    }
//
//    public static void slidingwindow(String s,int k) {
//
//      int left=0;
//      int right=0;
//
//      HashMap<Character,Integer> map=new HashMap<>();
//
//      while(left<s.length()-1)
//      {
//          char p=s.charAt(right);
//          map.put(p,map.getOrDefault(p,0)+1);
//
//          if(map.entrySet().stream().count())
//      }
//    }
//}
