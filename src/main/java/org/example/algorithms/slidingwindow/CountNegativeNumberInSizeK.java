package org.example.algorithms.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CountNegativeNumberInSizeK {

    public static void main(String[] args) {
        int[] ar={1,-2,3,0,-6,6,7,-9,2,-2,4,};
        int k=2;
        System.out.println(Arrays.toString(findNegative(ar,k)));
    }

    public static int[] findNegative(int[] ar,int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int l=0;
        int r=0;
        while(r<ar.length)
        {

                if(ar[r]<0)
                {
                    q.add(ar[r]);

                }
                if((r-l)+1==k )
                {
                    if(!q.isEmpty()) {
                        ans.add(q.peek());
                    }else{
                        ans.add(0);
                    }
                    if(!q.isEmpty() && ar[l] == q.peek())
                    {
                        q.poll();
                    }
                    l++;

                }

            r++;
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            res[i]=ans.get(i);
        }
        return res;
    }
}
