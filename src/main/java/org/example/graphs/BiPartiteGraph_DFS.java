package org.example.graphs;

import java.util.ArrayList;

public class BiPartiteGraph_DFS {

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


        int[] visited=new int[adj.size()];
        for(int i=0;i< visited.length;i++)
        {
            visited[i]=-1;
        }

        System.out.println(isbipartite(adj,0,visited));

    }

    public static boolean isbipartite(ArrayList<ArrayList<Integer>> adj,int start,int[] visited)
    {
        int node=start;

        // FIX: assign color to start node
        if (visited[start] == -1) {
            visited[start] = 0;
        }

        for(int neighbour: adj.get(start))
        {
            if(visited[neighbour]==-1)
            {
                visited[neighbour]=1-visited[start];

                if(!isbipartite(adj,neighbour,visited))
                {
                    return false;
                }
            }else{
                if(visited[neighbour]==visited[node])
                {
                    return false;
                }
            }

        }
        return true;
    }
}
