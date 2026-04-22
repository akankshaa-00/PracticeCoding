package org.example.graphs;

import java.util.ArrayList;

public class DFS_DetectCycleDirectedGraph {

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Directed edges
        adj.get(0).add(1);

        adj.get(1).add(3);

        adj.get(2).add(3);

        adj.get(3).add(4);

        System.out.println(detectcycledfs(adj));


    }

    public static boolean detectcycledfs(ArrayList<ArrayList<Integer>> adj)
    {
        int[] visited=new int[adj.size()];
        int[] pathvisited=new int[adj.size()];

        for(int j=0;j< adj.size();j++)
        {
            visited[j]=0;
            pathvisited[j]=0;
        }
        for(int i=0;i< adj.size();i++)
        {
            if(visited[i]==0)
            {
               //If for a node ,cycle is detected then return node ,else keep iterating
                if( iscycle(adj,i,visited,pathvisited)==true)
                    return true;
            }

        }
        return false;
    }
    public static boolean iscycle(ArrayList<ArrayList<Integer>> adj,int start,int[] visited,int[] pathvisited)
    {
        visited[start]=1;
        pathvisited[start]=1;

            for(Integer neighbour : adj.get(start))
            {
                    if(visited[neighbour]==0)
                    {
                        if(iscycle(adj,neighbour,visited,pathvisited)==true){
                            return true;
                        }
                    }else{
                        if(pathvisited[neighbour]==1)
                        {
                            return true;
                        }
                    }

            }
            pathvisited[start]=0;
            return false;
    }


}
