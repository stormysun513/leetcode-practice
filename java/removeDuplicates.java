public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int new_i = 0;
        for(int i = 0; i < nums.length; i++){
            while((i+1) < nums.length && nums[i] == nums[i+1]) i++;
            nums[new_i++] = nums[i]; 
            count++;
        }
        return count;
    }
}
