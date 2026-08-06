package org.example.algorithms.slidingwindow;

public class CountWinHasSumGreaterThanK {

    public static void main(String[] args) {
        int[] ar={2,4,0,6,1,5,8,4,9,7};
        System.out.println(countWindow(ar,6));
    }

    public static int countWindow(int[] ar,int k) {
        int l=0;
        int currSum=0;
        int count=0;
        for(int r=0;r< ar.length;r++)
        {
            currSum+=ar[r];

            if((r-l)+1==k)
            {
                    if(currSum>k)
                    {
                        count++;
                    }
                currSum-=ar[l];
                l++;
            }
        }
        return count;
    }
}
