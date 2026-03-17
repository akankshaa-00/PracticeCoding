package org.example.algorithms.backtracking;

import java.util.Arrays;

public class SudokuSolver {

    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        solve(board);
        for(int[] r:board)
        {
            Arrays.stream(r).forEach(System.out::print);
            System.out.println();
        }
    }

    public static boolean solve(int[][] sudoku)
    {
        int n= sudoku.length;
        int r= -1;
        int c= -1;

        boolean foundEmpty=false;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(sudoku[i][j]==0)
                {
                    r=i;
                    c=j;
                    foundEmpty=true;
                    break;
                }
            }

            if(foundEmpty==true)
            {
                break;
            }
        }

        if(foundEmpty==false)
        {
            return true;
            //sudoku is solved
        }

        //Backtrack
        for(int i=1;i<=9;i++)
        {
            if(isSafe(sudoku,r,c,i))
            {
                sudoku[r][c]=i;
                if(solve(sudoku))
                {//sudoku is solved
                    return true;
                }
                sudoku[r][c]=0;
            }
        }

        return false;

    }

    public static boolean isSafe(int[][] sudoku,int r,int c,int tar)
    {
        //Vertical column
        for(int i=0;i<sudoku.length;i++)
        {
            if(sudoku[i][c]==tar)
            {
                return false;
            }
        }

        //Horizontal row
        for(int i=0;i<sudoku[0].length;i++)
        {
            if(sudoku[r][i]==tar)
            {
                return false;
            }
        }

        //that particular maze
        int sqrt= (int) Math.sqrt(sudoku.length);
        int p=r-(r%sqrt);
        int q=c-(c%sqrt);
        for(int row=p;row<p+3;row++)
        {
            for(int col=q;col<q+3;col++)
            {
                if(sudoku[row][col]==tar)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
