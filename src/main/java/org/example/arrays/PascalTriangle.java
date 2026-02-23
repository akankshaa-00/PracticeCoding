package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        generateTriangle(5);

        //QuestionLink:https://takeuforward.org/data-structure/program-to-generate-pascals-triangle
    }

    public static void generateTriangle(int n){

        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<=n;i++)
        {
            List<Integer> col=new ArrayList<>();
            for(int j=0;j<i;j++)
            {
                if( j==0 || j==(i-1))
                {
                    col.add(1);
                }
                else
                {
                    col.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }

            }
            list.add(col);
        }

        for(List<Integer> a:list){
            for(Integer con: a)
            {
                System.out.print(con+" ");
            }
            System.out.println();
        }


    }
}
