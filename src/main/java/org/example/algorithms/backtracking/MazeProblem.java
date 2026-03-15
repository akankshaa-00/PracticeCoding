package org.example.algorithms.backtracking;

public class MazeProblem {
    public static void main(String[] args) {
        //System.out.println(maze(0,0));
        //printpath("",0,0);
        //pathRestrictions("",0,0);
        pathDiaganol("",0,0);
    }

    public static int maze(int r,int c)
    {
        int countpath=0;
        if(r==2 && c==2)
        {
            return 1;
        }

        if(r>2 || c>2)
        {
            return 0;
        }

         countpath=countpath+ maze(r+1,c);
         countpath=countpath+ maze(r,c+1);

         return countpath;
    }

    public static void printpath(String p,int r,int c)
    {
        if(r==2 && c==2)
        {
            System.out.println(p);
            return;
        }
        if(r>2 || c>2)
        {
            return ;
        }
        if(c<3) {
            printpath(p + 'R', r, c + 1);
        }
        if(r<3)
        {
            printpath(p + 'D', r + 1, c);
        }
    }

    public static void pathRestrictions(String p,int r ,int c)
    {
       // when (1,1) has restriction ,return;
        if(r==2 && c==2)
        {
            System.out.println(p);
            return;
        }

        if(r>2 || c>2 )
        {
            return;
        }
        if (r==1 && c==1) {
            return;
        }

        pathRestrictions(p+'R',r,c+1);
        pathRestrictions(p+'D',r+1,c);
    }

    public static void pathDiaganol(String p,int r ,int c)
    {
        // when total allowed ways are Vertical,Horizontal and Diagonal.
        if(r==2 && c==2)
        {
            System.out.println(p);
            return;
        }

        if(r>2 || c>2 )
        {
            return;
        }

        pathDiaganol(p+'H',r,c+1);
        pathDiaganol(p+'V',r+1,c);
        pathDiaganol(p+'D',r+1,c+1);
    }


}
