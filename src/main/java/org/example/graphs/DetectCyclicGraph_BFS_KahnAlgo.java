package org.example.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCyclicGraph_BFS_KahnAlgo {

    public static void main(String[] args) {
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

        ArrayList<Integer> ans=bfsiscyclic(adj);
        if(ans.size()!=adj.size())
        {
            System.out.println("Adj is cyclic");
        }else {
            System.out.println("Adj is not cyclic");
        }

    }

    public static ArrayList<Integer> bfsiscyclic(ArrayList<ArrayList<Integer>> adj){
        //Kahn's algorithm for BFS

        int[] indegree=new int[adj.size()];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i< adj.size();i++)
        {
            indegree[i]=0;
        }

            for(ArrayList<Integer> arr:adj)
            {
                for(int a:arr)
                {
                    indegree[a]=indegree[a]+1;
                }
            }

            for(int i=0;i< adj.size();i++)
            {
                if(indegree[i]==0)
                {
                    q.add(i);
                }
            }
            ArrayList<Integer> ans=new ArrayList<>();
            while(!q.isEmpty())
            {
                int node= q.poll();
                ans.add(node);

                for(Integer ar: adj.get(node))
                {
                    indegree[ar]=indegree[ar]-1;
                    if(indegree[ar]==0)
                    {
                        q.add(ar);
                    }
                }
            }
            return ans;
    }
}
