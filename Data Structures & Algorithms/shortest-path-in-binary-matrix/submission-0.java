class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        int n = grid.length;

        if ( n == 1 ) return 1;

        if ( grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1; 
        

        boolean[][] visited = new boolean[n][n];
        Deque<int[]> queue = new ArrayDeque<>(); 

        visited[0][0] = true; 
        int length = 1;
        queue.add( new int[]{0,0} );
        while ( !queue.isEmpty( ))
        {
            int queueLength = queue.size();
            for ( int i = 0; i < queueLength; i++ )
            {
                int[] pair = queue.poll();
                int r = pair[0], c = pair[1];
                
                if ( r == n - 1 && c == n - 1)
                {
                    return length;
                }

                int[][] neighbours = { { r - 1, c + 1 }, { r, c + 1 }, { r + 1, c + 1 },
                                       { r - 1, c     },               { r + 1, c     },
                                       { r - 1, c - 1 }, { r, c - 1 }, { r + 1, c - 1 } };
                                   
                for ( int j = 0; j<8; j++)
                {
                    int newR = neighbours[j][0];
                    int newC = neighbours[j][1];

                    if ( newR < 0 || newR == n || newC < 0 || newC == n || visited[newR][newC] == true || grid[newR][newC] == 1 )
                    {
                        continue;
                    }
                    queue.add(neighbours[j]);
                    visited[newR][newC] = true;
                }

            }
            length++;
            
        }
        return -1;


        
        
    }
}