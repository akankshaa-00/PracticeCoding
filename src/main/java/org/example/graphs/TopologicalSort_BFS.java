package org.example.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort_BFS {

    public static void main(String[] args) {
        //We will follow Kahn's Algorithm for BFS Topological Sort
        int V = 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // edges
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        bfs(adj);

    }

    public static void bfs(ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[adj.size()];
        Queue<Integer> q = new LinkedList<>();

        ArrayList<Integer> topo=new ArrayList<>();

        for (ArrayList<Integer> list : adj) {
            for (Integer r : list) {
                indegree[r] = indegree[r] + 1;
            }
        }

        for (int j = 0; j < adj.size(); j++) {
            if (indegree[j] == 0) {
                q.add(j);
            }
        }
        while (!q.isEmpty()) {

            int node = q.poll();
            topo.add(node);
            for (Integer ger : adj.get(node)) {
                indegree[ger]--;
                if (indegree[ger] == 0) {
                    q.add(ger);
                }
            }
        }
        System.out.println(topo);
    }
}

