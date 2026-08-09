package org.example.algorithms.slidingwindow.variablewindow;

import java.util.HashMap;

public class DeleteK1s {

        public static void main(String[] args) {
            int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};
            int k = 1;
            System.out.println(longestOnesAfterDelete(arr,k));
        }

        public static int longestOnesAfterDelete(int[] ar,int k) {

            //Decide on ds..can use int count for storing 0 frequency
            int count0=0;
            int bestlength=0;
            int l=0;
            for(int r=0;r<ar.length;r++)
            {
                if(ar[r]==0)
                {
                    count0++;
                }
                //Shrink when invalid
                while(count0>k)
                {
                    if(ar[l]==0)
                    {
                        count0--;
                    }
                    l++;
                }
                //store when valid
                bestlength=Math.max(bestlength,r-l+1);
            }
            return bestlength-1;
        }
    }

