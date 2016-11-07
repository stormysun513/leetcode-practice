public class Solution {
    public int numSquares(int n) {
        if(n <= 0) return 0;

        int[] table = new int[n+1];

        table[1] = 1;
        for(int i = 2; i <= n; i++){
            int min = Integer.MAX_VALUE;

            for(int j = 1; j*j <= i; j++){
                min = Math.min(min, table[i-j*j]);
            }
            table[i] = min + 1;
        }
        //System.out.println(Arrays.toString(table));
        return table[n];
    }
}
