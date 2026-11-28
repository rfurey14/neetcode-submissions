class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0){
            return 0;
        }

        int islandCount = 0; 
        int numRows = grid.length;
        int numCols = grid[0].length; 
        for(int r = 0; r < numRows; r++){
            for (int c = 0; c < numCols; c++){
                int [] check = {r, c};
                if (grid[r][c] == '1'){
                    islandCount +=1;
                    bfs(r,c,grid);
                }

            }
        }


        return islandCount;
        
    }

    public void bfs(int r, int c, char[][]grid){
        Queue<int[]> queue = new LinkedList<>();
        int[] newLoc = new int[] {r, c};
        queue.offer(newLoc);

        int numRows = grid.length;
        int numCols = grid[0].length;

        while (!queue.isEmpty()){
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];

            int[][] directions = {{-1,0},{0,1}, {1,0}, {0,-1}};

            for(int i = 0; i < directions.length; i++){
                int[] currDir = directions[i];
                int rowChange = currDir[0] + row;
                int colChange = currDir[1] + col;

                
                int[] current = new int[] {rowChange, colChange};
                if(rowChange >= 0 && colChange >= 0 && rowChange < numRows && colChange < numCols && grid[rowChange][colChange] == '1'){
                    grid[rowChange][colChange] = '0';
                    
                    queue.offer(current);


                }


            }
        }

    }
}
