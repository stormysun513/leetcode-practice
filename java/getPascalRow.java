public class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] buf = new int[2][];
        List<Integer> ans = new ArrayList();

        for(int i = 0; i <= rowIndex; i++){
            buf[i%2] = new int[rowIndex+1];
            buf[i%2][0] = 1;
        }

        for(int i = 1; i <= rowIndex; i++){
            for(int j = 1; j < i; j++){
                buf[i%2][j] = buf[(i-1)%2][j-1] + buf[(i-1)%2][j];
            }
            buf[i%2][i] = 1;
        }

        for(int i = 0; i <= rowIndex; i++){
            ans.add(buf[rowIndex%2][i]);
        }
        return ans;
    }
}
