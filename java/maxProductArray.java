public class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        int max = nums[0];
        int min = nums[0];
        int ans = max;

        for(int i = 1; i < nums.length; i++){
            int maxhere = Math.max(Math.max(max*nums[i], min*nums[i]), nums[i]);
            int minhere = Math.min(Math.min(max*nums[i], min*nums[i]), nums[i]);
            ans = Math.max(ans, maxhere);
            max = maxhere;
            min = minhere;
        }
        return ans;
    }
}
