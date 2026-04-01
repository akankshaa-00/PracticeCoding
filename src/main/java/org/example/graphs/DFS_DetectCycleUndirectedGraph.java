package org.example.graphs;

import java.util.ArrayList;

public class DFS_DetectCycleUndirectedGraph {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjacencylist=new ArrayList<>();
        int n=8;
        for(int i=0;i<n;i++)
        {
            adjacencylist.add(new ArrayList<>());
        }
        // --- Component A (Triangle: 0-1, 1-2, 2-0) ---
        adjacencylist.get(0).add(1); adjacencylist.get(1).add(0);
        adjacencylist.get(1).add(2); adjacencylist.get(2).add(1);
        adjacencylist.get(2).add(0); adjacencylist.get(0).add(2);

        // --- Component B (Line: 3-4) ---
        adjacencylist.get(3).add(4);
        adjacencylist.get(4).add(3);
        boolean[] visited=new boolean[adjacencylist.size()];
        int parent=-1;
        System.out.println(isCycle_DFS(adjacencylist,1,visited,parent));
    }

    public static boolean isCycle_DFS(ArrayList<ArrayList<Integer>> adj,int start,boolean[] visited,int parent)
    {
        int node=start;
        visited[node]=true;

        for(int neighbour: adj.get(node))
        {
            if(!visited[neighbour])
            {
                if(isCycle_DFS(adj,neighbour,visited,node))
                {
                    return true;
                }
            }else{
                if(neighbour!=parent)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
