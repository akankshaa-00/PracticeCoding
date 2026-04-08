package org.example.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    public static void main(String[] args) {
        String[][] grid = {
                    {"1","1","1","1","0"},
                    {"1","1","0","1","0"},
                    {"1","1","0","0","0"},
                    };

        System.out.println(noOfIslands(grid));
}

    public static int noOfIslands(String[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=="1")
                {
                    bfs(grid,i,j);
                    count++;

                }
            }
        }
        return count;
    }

    public static void dfs(String[][] grid,int i,int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j].equals("0") || grid[i][j].equals("$"))
        {
            return;
        }

        grid[i][j]="$";

        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }

    public static void bfs(String[][] grid,int i,int j)
    {
        Queue<int[]> queue=new LinkedList<>();
        if(grid[i][j].equals("1"))
        {
            grid[i][j]="$";
            queue.add(new int[]{i, j});
        }
        while(!queue.isEmpty())
        {
            int[] q;
            q=queue.poll();
            if(q[0]+1>=0 && q[0]+1< grid.length && grid[q[0]+1][q[1]].equals("1"))
            {
                grid[q[0]+1][q[1]]="$";
                queue.add(new int[]{q[0]+1,q[1]});
            }
            if(q[1]+1>=0 && q[1]+1< grid[0].length && grid[q[0]][q[1]+1].equals("1"))
            {
                grid[q[0]][q[1]+1]="$";
                queue.add(new int[]{q[0],q[1]+1});
            }
        }
    }
}
