public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length = nums.length;
        int ans = 0;
        for(int i = 0; i < length; i++){
            int count = 0;
            while(i < length && nums[i] == 0) i++;
            while(i < length && nums[i] == 1){
                i++;
                count++;
            }
            ans = Math.max(ans, count);
        }
        return ans;

    }
}
