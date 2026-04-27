package org.example.graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort_DFS {

    //Assuming we are getting DAG (Directed Acyclic graph in input)
    public static void main(String[] args) {
        //Intution is to call dfs for node and only print them while coming back
        //1->2->3
        //Keep callling dfs starting from 1 ,while returning print nodes ,hence neighbour nodes are always
        //printed at the right of main node
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

        Stack<Integer> stk=topological(adj,V);

        while(!stk.isEmpty())
        {
            System.out.print(stk.pop() + " ");
        }
    }


    public static Stack<Integer> topological(ArrayList<ArrayList<Integer>> adj, int v)
    {
        Stack<Integer> stack=new Stack<>();
        boolean[] visited=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(!visited[i])
            {
                 dfs(adj,i,visited,stack);
            }
        }
        return stack;
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean[] visited, Stack<Integer> stack){

        visited[node]=true;
        for(Integer a : adj.get(node))
        {
            if(!visited[a])
            {
                dfs(adj,a,visited,stack);
            }
        }

        // Backtracking point: All dependencies of 'node' are now in the stack.
        // We can now safely put 'node' on top.
        stack.push(node);
    }
}
