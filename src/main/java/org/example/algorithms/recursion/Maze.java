package org.example.algorithms.recursion;

public class Maze {

    public static void main(String[] args) {
        System.out.println(waysToLastBox(1,1));
    }

    public static int waysToLastBox(int r,int c){
        //baseCase
        int right=0;
        int left=0;
        if (r == 3 && c == 3) {

            return 1;
        } else if (r<=3 && c<=3) {

             right = waysToLastBox(r, c + 1);
             left = waysToLastBox(r + 1, c);

        }
        return left + right;
    }
}
