class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int ROWS = image.length; 
        int COLS = image[0].length;
        int targetColour = image[sr][sc];
        fill(image,sr,sc,color,targetColour);
        return image;
    }

    public void fill( int[][] image, int row, int col, int colour, int targetColour )
    {
        int ROWS = image.length;
        int COLS = image[0].length; 

        if ( Math.min(row,col) < 0 || row == ROWS || col == COLS || image[row][col]!=targetColour || image[row][col]==colour   )
        {
            return;
        }
        else
        {
            image[row][col] = colour;
            fill(image,row+1,col,colour,targetColour);
            fill(image,row-1,col,colour,targetColour);
            fill(image,row,col+1,colour,targetColour);
            fill(image,row,col-1,colour,targetColour);
            return;
        }

    }

}