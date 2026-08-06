package org.example.algorithms.slidingwindow;

public class FixedWindow {

    public static void main(String[] args) {
        //Max sum of subarray of size K
        int [] arr={-1,2,3,1,-4,7,0,-3};
        int[] ar={2,4,1,8};
        System.out.println(findMax(ar,2));
        System.out.println(withPointers(ar,2));
    }

    public static int findMax(int[] ar,int k) {
        //Algo i will follow w/o pointers just for loop

        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            //first find first window of k size
            currsum+=ar[i];
        }
        maxsum=currsum;

        for(int j=1;j<= ar.length-k;j++)
        {
            currsum=currsum-ar[j-1];
            currsum=currsum+ar[j+(k-1)];
            if(currsum>maxsum)
            {
                maxsum=currsum;
            }

        }
        return maxsum;
    }

    public static int withPointers(int[] ar,int k) {
        //Now i will have left and right pointers
        //left start-index and right as left +k
        //will keep moving these to slide the window
        //        int [] arr={-1,2,3,1,-4,7,0,-3};
        //                      l,r
        int l=0;
        int r=1;
        //Find 1st window
        int curr=ar[0];
        int ans=Integer.MIN_VALUE;
        while(r<ar.length)
        {
            if((r-l)+1<=k)
            {
                curr+=ar[r];
                if((r-l)+1==k)
                {
                    if(curr>ans)
                    {
                        ans=curr;
                    }
                    curr-=ar[l];
                    l++;
                }
                r++;
            }
        }
        return ans;
    }
}
