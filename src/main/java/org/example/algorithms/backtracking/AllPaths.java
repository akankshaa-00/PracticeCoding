package org.example.algorithms.backtracking;

import java.util.Arrays;

public class AllPaths {

    public static void main(String[] args) {

        boolean[][] maze={{true,true,true},
                        {true,true,true},
                        {true,true,true}};
        //mazeAllPaths("",maze, 0, 0);
        int[][] path=new int[maze.length][maze[0].length];
        mazeAllPathsInMaze("",maze,0,0,path,1);
    }

    public static void mazeAllPaths(String p,boolean[][] maze,int r,int c)
    {
        //User can move in all 4 directions-Left,Right,Up and Below
        if(r==2 && c==2)
        {
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
        {
            return;
        }

        //Path that was walked on ,make it false
        maze[r][c]=false;

        if((c+1)<3)
        {
            mazeAllPaths(p+'R',maze,r,c+1);
        }

        if((r+1)<3)
        {
            mazeAllPaths(p+'D',maze,r+1,c);
        }

        if((r-1)>=0){
            mazeAllPaths(p+"U",maze,r-1,c);
        }

        if((c-1)>=0)
        {
            mazeAllPaths(p+'L',maze,r,c-1);
        }

        //Revert the changes when recursive call ends
        maze[r][c]=true;
    }


    public static void mazeAllPathsInMaze(String p,boolean[][] maze,int r,int c,int[][] path,int count)
    {
        //User can move in all 4 directions-Left,Right,Up and Below
        if(r==2 && c==2)
        {
            path[r][c]=count;
            for(int[] a:path)
            {
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
        {
            return;
        }

        path[r][c]=count;

        //Path that was walked on ,make it false
        maze[r][c]=false;

        if((c+1)<3)
        {
            mazeAllPathsInMaze(p+'R',maze,r,c+1,path,count+1);
        }

        if((r+1)<3)
        {
            mazeAllPathsInMaze(p+'D',maze,r+1,c,path,count+1);
        }

        if((r-1)>=0){
            mazeAllPathsInMaze(p+"U",maze,r-1,c,path,count+1);
        }

        if((c-1)>=0)
        {
            mazeAllPathsInMaze(p+'L',maze,r,c-1,path,count+1);
        }

        //Revert the changes when recursive call ends
        maze[r][c]=true;

        path[r][c]=0;
    }
}
