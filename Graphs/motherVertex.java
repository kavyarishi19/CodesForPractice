package Graphs;

public class motherVertex {
    
}


class Solution
{
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
    }
}

public int findMotherVertex(int N, ArrayList<ArrayList<Integer>>adj){
    Stack<Integer> stack = new Stack<>();
    boolean[] visited = new boolean[N];
    for (int i = 0; i < N; i++) {
        if (!visited[i]) {
            dfs(adj, visited, i, stack);
        }
    }
    count=0;
    visited = new boolean[N];
    int ans = stack.pop();
    dfs(adj,visited,ans);
    if(count == N){
     return ans+1;
    }else{
       return -1;
    }
    
}
static int count;

public static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int cur) {
    visited[cur] = true;
    count++;
    for (Integer neighbour : graph.get(cur)) {
        if (!visited[neighbour]) {
            dfs(graph, visited, neighbour);
        }
    }
}
public static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int cur, Stack<Integer> stack) {
    visited[cur] = true;
    for (Integer neighbour : graph.get(cur)) {
        if (!visited[neighbour]) {
            dfs(graph, visited, neighbour, stack);
        }
    }
    stack.push(cur);
}

