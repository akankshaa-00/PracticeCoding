package org.example.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFS_Search {

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

        boolean[] visited=new boolean[adjacencylist.size()];
        ArrayList<Integer> answers=new ArrayList<>();
        dfs(adjacencylist,0,visited,answers);
        System.out.println(answers);
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adjecency,int start,boolean[] visited,ArrayList<Integer> answers)
    {
        if(visited[start])
        {
            return;
        }

        visited[start] = true;      // ✅ mark current
        answers.add(start);         // ✅ add current
        for (int neighbour : adjecency.get(start)) {
                    dfs(adjecency, neighbour, visited, answers);
                }

    }
}
