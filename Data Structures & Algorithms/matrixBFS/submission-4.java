class Solution {
    public int shortestPath(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        
        // If start or end is a rock, no path exists
        if (grid[0][0] == 1 || grid[ROWS-1][COLS-1] == 1) {
            return -1;
        }
        
        int[][] visit = new int[ROWS][COLS];
        Deque<int[]> queue = new ArrayDeque<>();
        
        // Start from top-left corner
        queue.add(new int[]{0, 0});
        visit[0][0] = 1;
        
        int length = 0;
        while (!queue.isEmpty()) {
            int queueLength = queue.size();
            for (int i = 0; i < queueLength; i++) {
                int[] pair = queue.poll();
                int r = pair[0], c = pair[1];
                
                // Check if we reached destination
                if (r == ROWS - 1 && c == COLS - 1) {
                    return length;
                }
                
                // Define possible moves
                int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
                for (int[] dir : directions) {
                    int newR = r + dir[0];
                    int newC = c + dir[1];
                    
                    // Check boundaries, visited status, and if it's land
                    if (newR < 0 || newR >= ROWS || newC < 0 || newC >= COLS 
                        || visit[newR][newC] == 1 || grid[newR][newC] == 1) {
                        continue;
                    }
                    
                    // Add valid neighbor to queue
                    queue.add(new int[]{newR, newC});
                    visit[newR][newC] = 1;
                }
            }
            length++; // Increment after processing all nodes at current level
        }
        
        return -1; // No path found
    }
}
