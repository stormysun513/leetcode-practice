public class Solution {
    public int numTrees(int n) {
        int[] table = new int[n+1];
        table[0] = 1;
        table[1] = 1;
        
        for(int i = 2; i <= n; i++){
            int temp = 0;
            for(int j = 0; j < i; j++){
                temp += table[j]*table[i-1-j];
            }
            table[i] = temp;
        }
        return table[n];
    }
}