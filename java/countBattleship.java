public class Solution {
    public int countBattleships(char[][] board) {
        if(board == null) return 0;

        int count = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                char c = board[i][j];
                boolean check = true;
                if(c == 'X'){
                    if(i - 1 >= 0 && board[i-1][j] == 'X'){
                        check = false;
                    }
                    if(j - 1 >= 0 && board[i][j-1] == 'X'){
                        check = false;
                    }
                    if(check) count++;
                }
            }
        }
        return count;
    }
}
