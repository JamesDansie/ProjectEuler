package leet;

public class NumberOfIslands200 {
    public static int numIslands(char[][] grid){
        int numOfIslands = 0;
            for(int row = 0; row < grid.length; row++){
                for(int col = 0; col < grid[row].length; col++){
                    if(grid[row][col] == '1'){
                        numOfIslands++;
                        dfs(grid, row, col);
                    }
                }
            }
        return  numOfIslands;
    }
    public static void dfs(char[][] grid, int row, int col){
        if(row < 0 ||
            col < 0 ||
            row >= grid.length ||
            col >= grid[row].length ||
            grid[row][col] == '0')
        {
            return;
        }
        grid[row][col] = '0';
        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);
    }
}
