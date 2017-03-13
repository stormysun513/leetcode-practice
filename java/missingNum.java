public class Solution {
    public int missingNumber(int[] nums) {
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            temp ^= num;
            temp ^= i;
        }
        return temp^nums.length;
    }
}
