package org.example.graphs;

import java.util.*;

public class BFS_Search {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjacencylist=new ArrayList<>();
        int n=8;
        for(int i=0;i<n;i++)
        {
            adjacencylist.add(new ArrayList<>());
        }
        adjacencylist.get(0).add(1);
        adjacencylist.get(0).add(2);

        adjacencylist.get(1).add(0);

        adjacencylist.get(2).add(0);
        adjacencylist.get(2).add(3);
        adjacencylist.get(2).add(4);

        adjacencylist.get(3).add(2);

        adjacencylist.get(4).add(2);
        adjacencylist.get(4).add(5);

        adjacencylist.get(5).add(4);

        System.out.println(bfs(adjacencylist,4));


    }

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj,int starting_point)
    {
        ArrayList<Integer> answers=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        int[] visited=new int[adj.size()];


        queue.add(starting_point);
        visited[starting_point]=1;

        while(!queue.isEmpty())
        {
            int node=queue.poll();
            answers.add(node);

            ArrayList<Integer> neighbours = adj.get(node);
            for(int neightbour : neighbours)
            {
                if(visited[neightbour]==0)
                {
                    queue.add(neightbour);
                    visited[neightbour]=1;
                }
            }
        }
        return answers;

    }
}
