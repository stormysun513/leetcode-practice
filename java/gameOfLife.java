public class Solution {
    public int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
    public int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0) return;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                getNext(board, i, j);
            }
        }
        next(board);
    }

    public void next(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                board[i][j] >>>= 1;
            }
        }
    }

    public void getNext(int[][] board, int i, int j){
        int count = 0;

        for(int n = 0; n < 8; n++){
            int x = i + dx[n];
            int y = j + dy[n];

            if(x < 0 || x >= board.length || y < 0 || y >= board[0].length) continue;
            count += (board[x][y] & 1);
        }

        if((board[i][j] & 1) != 0){
            if(count >= 2 && count <= 3){
                board[i][j] = 3;
            }
        }
        else{
            if(count == 3){
                board[i][j] = 2;
            }
        }
    }
}
