package org.example.graphs;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BiPartiteGraph_BFS {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v=3;
        for(int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // edges
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(0);
        adj.get(0).add(2);
        System.out.println(isbipartite(adj));
    }

    public static boolean isbipartite(ArrayList<ArrayList<Integer>> adj)
    {
        int[] color=new int[adj.size()];
        for(int i=0;i< color.length;i++)
        {
            color[i]=-1;
        }

        for(int i=0;i< adj.size();i++)
        {
            if(color[i]==-1)
            {
                if(!bfs(adj,i,color))
                {
                    return false;
                }

            }
        }
        return true;
    }

    public static boolean bfs(ArrayList<ArrayList<Integer>> adj,int start,int[] color)
    {
        Queue<Integer> q=new LinkedList<>();

        q.add(start);
        color[start]=1;
        while(!q.isEmpty())
        {
            int node= q.poll();

            for(int curr: adj.get(node))
            {
                if(color[curr]==-1)
                {
                    q.add(curr);
                   if(color[node]==0)
                   {
                       color[curr]=1;
                   }else {
                       color[curr]=0;
                   }

                } else if (color[curr]== color[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}
