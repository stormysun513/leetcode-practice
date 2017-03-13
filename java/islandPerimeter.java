public class Solution {
    public int[] dx = {0, 0, 1, -1};
    public int[] dy = {1, -1, 0, 0};

    public int islandPerimeter(int[][] grid) {
        int count = 0;
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    for(int k = 0; k < 4; k++){
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if(emptyAdjacentBlock(nx, ny, grid)){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public boolean emptyAdjacentBlock(int x, int y, int[][] grid){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) return true;
        return (grid[x][y] == 0) ? true : false;
    }
}
