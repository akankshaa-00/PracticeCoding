package org.example.algorithms.backtracking;

import java.util.Arrays;

public class NQueens {

    public static void main(String[] args) {
        boolean[][] board={{true,true,true,true},
                            {true,true,true,true},
                            {true,true,true,true},
                            {true,true,true,true}};
        queens(board,4,0);
    }

    public static void queens(boolean[][] board, int n, int r) {
        if (r == board.length) {
            for(boolean[] ar: board)
            {
               for(boolean b:ar)
               {
                   if(b)
                   {
                       System.out.print('X');
                   }else{
                       System.out.print('Q');
                   }
               }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < board[0].length; i++) {
            if (isSafe(board, r, i))
            {
                board[r][i]=false;
                queens(board, n, r + 1);
                board[r][i]=true;
            }
        }
    }

    public static boolean isSafe(boolean[][] board, int r, int c)
    {
        //vertical check
        for(int i=r-1;i>=0;i--)
        {
            if(board[i][c]==false)
            {
                return false;
            }
        }

        //Right diagonal check
        int maxRight=Math.min(r,((board[0].length)-c)-1);
        for(int i=1;i<=maxRight;i++)
        {
            if(board[r-i][c+i]==false)
            {
                return false;
            }

        }
        //Left diagonal Check
        int maxLeft=Math.min(r,c);
        for(int i=1;i<=maxLeft;i++)
        {

            if(board[r-i][c-i]==false)
            {
                return false;
            }
        }
        return true;
    }
}
