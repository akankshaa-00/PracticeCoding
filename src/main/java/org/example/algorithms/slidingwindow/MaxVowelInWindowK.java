package org.example.algorithms.slidingwindow;

import java.util.LinkedList;
import java.util.Queue;

public class MaxVowelInWindowK {

    public static void main(String[] args) {

        char[] ar={'a','e','i','p','q','f','i'};
        int k;
        System.out.println(countVowel(ar,4));

    }

    public static int countVowel(char[] ar,int k) {
        int count=0;
        int l=0;
        Queue<Character> q=new LinkedList<>();
        int ans=Integer.MIN_VALUE;
        for(int r=0;r< ar.length;r++)
        {
            if(ar[r]=='a'||ar[r]=='e'||ar[r]=='i'||ar[r]=='o'||ar[r]=='u')
            {
                q.add(ar[r]);
                count++;
            }
            if((r-l)+1==k)
            {
                ans=Math.max(ans, q.size());
                if(!q.isEmpty() && q.peek()==ar[l])
                {
                    q.poll();
                    l++;
                }
            }
        }
        return ans;
    }
}
