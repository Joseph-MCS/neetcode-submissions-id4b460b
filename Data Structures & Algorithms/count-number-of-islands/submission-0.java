class Solution {
    public int numIslands(char[][] grid) {

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for ( int i = 0; i<grid.length; i++)
        {
            for ( int j = 0; j<grid[0].length; j++)
            {
                visited[i][j] = false;
            }
        }
        int islandCount = 0; 
        for ( int i = 0; i<grid.length; i++)
        {
            for ( int j = 0; j<grid[0].length; j++)
            {
                if ( !visited[i][j] && grid[i][j] == '1')
                {
                    traverse(grid,i,j,visited);
                    islandCount++;
                }
            }
        }
        return islandCount;
        
        
    }


    public void traverse( char[][] grid, int row, int col, boolean[][] visited)
    { 
        int ROWS = visited.length;
        int COLS = visited[0].length;
        
        if ( Math.min(row,col)<0 || row >= ROWS || col >= COLS || grid[row][col] == '0' || visited[row][col] == true )
        {
            return;
        }
        visited[row][col] = true;
        traverse( grid, row - 1, col, visited);
        traverse(grid, row + 1, col, visited);
        traverse( grid, row, col+1, visited );
        traverse(grid,row,col-1,visited);
        return;
        
        
    }
}
