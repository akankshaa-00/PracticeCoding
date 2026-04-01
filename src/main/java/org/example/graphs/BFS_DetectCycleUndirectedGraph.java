package org.example.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_DetectCycleUndirectedGraph {

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

        System.out.println(detectcycle(adjacencylist.size(), adjacencylist));

    }

    public static boolean detectcycle(int n,ArrayList<ArrayList<Integer>> adjlist)
    {
        boolean[] visited=new boolean[adjlist.size()];
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                 if(iscycle(i,adjlist,visited))
                     return true;
            }
        }
        return false;
    }

    public static boolean iscycle(int start, ArrayList<ArrayList<Integer>> adjlist,boolean[] visited)
    {
        Queue<int[]> q=new LinkedList<>();


        q.add(new int[]{start,-1});
        visited[start]=true;

        while(!q.isEmpty()) {

            int[] curr = q.poll();
                int node=curr[0];
                int parent = curr[1];

                for(int neighbour: adjlist.get(node))
                {
                    if (visited[neighbour]) {
                        if (neighbour != parent)
                            return true;
                    } else {
                        visited[neighbour]=true;
                        q.add(new int[]{neighbour, node});
                    }
                }

        }

        return false;
    }
}
