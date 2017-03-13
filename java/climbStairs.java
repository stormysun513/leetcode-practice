public class Solution {
    public int climbStairs(int n) {
        int[] tbl = new int[n+1];

        if(n <= 0) return 0;
        if(n <= 1) return 1;
        if(n <= 2) return 2;

        tbl[1] = 1;
        tbl[2] = 2;

        for(int i = 3; i <= n; i++){
            tbl[i] = tbl[i-1] + tbl[i-2];
        }
        return tbl[n];
    }
}
