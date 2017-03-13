public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int[] table = new int[nums.length];

        table[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            table[i] = table[i-1] + nums[i];
        }

        int min = table[0];
        int ans = min;
        for(int i = 1; i < table.length; i++){
            ans = Math.max(ans, table[i]);
            ans = Math.max(ans, table[i] - min);
            min = Math.min(min, table[i]);
        }
        return ans;
    }
}
