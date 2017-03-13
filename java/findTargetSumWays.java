public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        return findTargetRecursive(nums, 0, S);
    }

    public int findTargetRecursive(int[] nums, int i, int S){
        if(i == nums.length){
            if(S == 0) return 1;
            else return 0;
        }
        int sum = 0;
        sum += findTargetRecursive(nums, i+1, S-nums[i]);
        sum += findTargetRecursive(nums, i+1, S+nums[i]);
        return sum;
    }
}
