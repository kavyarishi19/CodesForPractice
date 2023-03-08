package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class numberofEnclaves {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");
        int m = Integer.parseInt(st[0]);
        int n = Integer.parseInt(st[1]);

        int[][] arr = new int[m][n];

        for(int i =0; i<m ; i++){
            st =br.readLine().split(" ");
            for(int j =0; j< n ; j++){
                arr[i][j] = Integer.parseInt(st[j]);
            }
        }

        System.out.println();
    }

    class Solution {
        public int numEnclaves(int[][] grid) {
            int res=0;
            for(int i=0;i<grid.length;i++){
                if(grid[i][0] == 1) dfs(grid,i,0);
                if(grid[i][grid[0].length-1] == 1) dfs(grid,i,grid[0].length-1);
            }
            for(int i=0;i<grid[0].length;i++){
                if(grid[0][i] == 1) dfs(grid,0,i);
                if(grid[grid.length-1][i] == 1) dfs(grid,grid.length-1,i);
            }
            for(int i=0;i<grid.length;i++)
                for(int j=0;j<grid[0].length;j++)
                    if(grid[i][j] == 1) res++;
            return res;
        }
        public void dfs(int[][] grid,int i,int j){
            if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j] == 0) return;
            grid[i][j] = 0;
            dfs(grid,i-1,j);
            dfs(grid,i,j+1);
            dfs(grid,i+1,j);
            dfs(grid,i,j-1);
        }
    }
    
}
