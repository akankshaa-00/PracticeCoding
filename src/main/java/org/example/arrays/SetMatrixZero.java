package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {

    //Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix..
    //
    //Examples
    //Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
    //Output: [[1,0,1],[0,0,0],[1,0,1]]
    //Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
    //
    //Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
    //Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
    //Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0

    //Question-Link: https://takeuforward.org/data-structure/set-matrix-zero
    public static void main(String[] args) {
        //setRowColumnZero();
        setMoreThanOneZero();
    }

    public static void setRowColumnZero(){
        List<List<Integer>> matrix=List.of(
                List.of(1,0,1),
                List.of(1,1,1),
                List.of(1,1,1));

        int i=0;
        int j=0;
        boolean flag=false;
        for( i=0;i<matrix.size();i++)
        {
            for( j=0;j<matrix.size();j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    flag=true;
                    break;
                }
            }
            if(flag) {break;}
        }

        for(int k=0;k< matrix.size();k++)
        {
            for(int l=0;l< matrix.size();l++)
            {
                if(k==i || l==j)
                {
                    System.out.print(0);
                }else{
                    System.out.print(matrix.get(k).get(l));
                }
            }
            System.out.println(" ");
        }

    }

    public static void setMoreThanOneZero(){

        List<List<Integer>> matrix=List.of(
                List.of(1,3,9,0),
                List.of(3,0,1,2),
                List.of(7,5,4,2),
                List.of(1,1,2,3)
        );

    List<Integer> col=new ArrayList<>();
    List<Integer> row=new ArrayList<>();
        for(int c=0;c<matrix.size();c++){
            for(int r=0;r<matrix.get(c).size();r++)
            {
                if(matrix.get(c).get(r)==0)
                {
                col.add(c);row.add(r);
                }
            }
        }

        for(int c=0;c<matrix.size();c++){
            for(int r=0;r<matrix.get(c).size();r++)
            {
                if(col.contains(c) || row.contains(r))
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(matrix.get(c).get(r));
                }
            }
            System.out.println();
        }



    }
}


