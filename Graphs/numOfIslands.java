package Graphs;

public class numOfIslands {
    public int numIsIslands(char[][] grid){
        if(grid == null) return 0;
        int islandCount =0;
        for(int i=0; i< grid.length;i++){
            for(int j=0; j< grid[0].length; j++){
                if(grid[i][j] == '1'){
                    // increase our island count
                    ++islandCount;
                    // change  any other land connected to zeros
                    changeLandToWater(grid, i, j);
                }
            }
        }
        return islandCount;
    }

    private void changeLandToWater(char[][] grid , int i,int j){
        //1) row less 0
        //2) row greater than grid.length
        //3) column less 0
        //4) column greater than grid[0].length (column length)
        //5) if position is a '0'
        if(i<0 || i>= grid.length|| j<0|| j>= grid[0].length || grid[i][j] == '0') return;
        grid[i][j] ='0';
        changeLandToWater(grid, i-1, j);
        changeLandToWater(grid, i+1, j);
        changeLandToWater(grid, i, j-1);
        changeLandToWater(grid, i, j+1);
    }
}
