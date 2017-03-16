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

    public int maxSubArray2(int[] nums) {
        if(nums == null || nums.length == 0) 
            return 0;

        int sum = nums[0];
        int min = nums[0];
        int ans = sum;

        for(int i = 1; i < nums.length; i++){
            sum += nums[i];
            ans = Math.max(Math.max(ans, sum - min), sum);
            min = Math.min(min, sum);
        }
        return ans;
    }
}
