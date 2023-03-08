package Graphs;

import java.util.ArrayList;

public class dfs {
    public static void dfs(int node , boolean vis[] , ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        //marking current node as visited
        vis[node] = true;
        ls.add(node);

        //getting neighbour nodes
        for(Integer it: adj.get(node)){
            if(vis[it] == false){
                dfs(it,vis,adj,ls);
            }
        }
    }
    //function to return a list containing the DFS traversal at the Graph
    public ArrayList<Integer> dfsOfGraph(int V , ArrayList<ArrayList<Integer>> adj){
        
        //boolean array to keep the track of visited vertices
        boolean vis[] = new boolean[V+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }
}
