class Solution {
    public int countPaths(int[][] grid) {

        int ROWS = grid.length; 
        int COLS = grid[0].length; 

        int[][] visited = new int[ROWS][COLS];

        for ( int i = 0; i<ROWS; i++)
        {
            for ( int j = 0; j<COLS;j++)
            {
                visited[i][j] = 0;
                // unvisited : 0 
                // visited : 1 
            }
        }

        return dfs( grid, 0, 0, visited );

    }

    public int dfs( int[][] grid, int row, int col, int[][] visited )
    {

        int ROWS = grid.length;
        int COLS = grid[0].length;

        if ( Math.min(row,col) < 0 || row == ROWS || col == COLS || visited[row][col] == 1 || grid[row][col] == 1 )
        {
            return 0;
        }
        if ( row == ROWS - 1 && col == COLS - 1)
        {
            return 1;
        }

        visited[row][col] = 1;

        int count = 0; 

        count += dfs(grid, row+1, col, visited );
        count += dfs(grid, row-1, col, visited );
        count += dfs(grid, row, col+1, visited );
        count += dfs(grid, row, col-1, visited );

        visited[row][col] = 0;
        return count;
    }
}