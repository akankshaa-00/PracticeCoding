package org.example.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Rotten_Tomatoes {


    public static void main(String[] args) {
        int[][] mat =
                {{2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};

        System.out.println(steps(mat));
    }

    public static int steps(int[][] mat)
    {
        int freshtomatoes=0;
        int time=0;

        Queue<int[]> queue=new LinkedList<>();

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==2)
                {
                    queue.add(new int[]{i,j,0});
                } else if (mat[i][j]==1) {
                    freshtomatoes=freshtomatoes+1;
                }
            }
        }
        int[][] dirs={{1,0},{0,1},{-1,0},{0,-1}};
        while(!queue.isEmpty())
        {
            int[] curr=queue.poll();
            int r=curr[0];int c=curr[1];int t=curr[2];

            time=Math.max(time,t);



            for(int[] dir:dirs)
            {
                int nr=r+dir[0];
                int nc=c+dir[1];

                if(nr<mat.length &&  nc<mat[0].length && nr>=0 && nc>=0 && mat[nr][nc]==1)
                {
                    mat[nr][nc]=2;
                    freshtomatoes-=1;
                    queue.add(new int[]{nr,nc,t+1});
                }

            }


        }
        if(freshtomatoes == 0) return time;
        else return -1;

    }
}
