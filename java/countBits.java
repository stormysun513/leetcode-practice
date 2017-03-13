public class Solution {
    public int[] countBits(int num) {
        int[] ans = new int[num+1];

        if(num == 0) return ans;
        ans[1] = 1;

        for(int i = 2; i <= num; i++){
            for(int j = 0; j < i && i+j <= num; j++){
                ans[i+j] = 1 + ans[j];
            }
            i = 2*i - 1;
        }
        return ans;
    }
}
