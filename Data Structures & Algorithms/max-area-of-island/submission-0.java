class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;
        for ( int i = 0; i<grid.length; i++)
        {
            for ( int j = 0; j<grid[0].length; j++)
            {

                int area = dfs(grid,i,j);
                if ( area > maxArea) maxArea = area;

            }
        }  
        return maxArea;  
    }

    public int dfs( int[][] grid, int row, int col)
    {

        int ROWS = grid.length;
        int COLS = grid[0].length;
        int count = 0; 

        if ( Math.min(row,col) < 0 || row >= ROWS || col >= COLS || grid[row][col] == 0)
        {
            return 0;
        }
        else
        {

            grid[row][col] = 0;
            count++;
            count += dfs( grid, row + 1, col );
            count += dfs( grid, row - 1, col );
            count += dfs( grid, row, col + 1);
            count += dfs( grid, row, col - 1);
            return count;

        }
    }

    
}
