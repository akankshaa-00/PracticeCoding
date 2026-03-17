package org.example.algorithms.backtracking;

public class NKnights {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(n, board, 0, 0);
    }

    public static void knights(int tar, boolean[][] board, int r, int c) {

        // All knights placed
        if (tar == 0) {
            printBoard(board);
            return;
        }

        // Board finished
        if (r == board.length) {
            return;
        }

        // Calculate next cell
        int nextR = r;
        int nextC = c + 1;

        if (nextC == board.length) {
            nextR = r + 1;
            nextC = 0;
        }

        // Place knight
        if (isSafe(board, r, c)) {
            board[r][c] = true;
            knights(tar - 1, board, nextR, nextC);
            board[r][c] = false;
        }

        // Skip cell
        knights(tar, board, nextR, nextC);
    }

    public static boolean isSafe(boolean[][] board, int r, int c) {

        if (r - 2 >= 0 && c - 1 >= 0 && board[r - 2][c - 1]) return false;
        if (r - 2 >= 0 && c + 1 < board.length && board[r - 2][c + 1]) return false;
        if (r - 1 >= 0 && c - 2 >= 0 && board[r - 1][c - 2]) return false;
        if (r - 1 >= 0 && c + 2 < board.length && board[r - 1][c + 2]) return false;

        return true;
    }

    public static void printBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "K " : "X ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
