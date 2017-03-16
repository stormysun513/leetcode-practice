public class Solution {
    public int findPairs(int[] nums, int k) {
        int i = 0;
        int count = 0;
        Arrays.sort(nums);
        
        while(i < nums.length){
            int j = i+1;
            while(j < nums.length){
                if(nums[j] - nums[i] == k){
                    count++;
                    break;
                }
                else if(nums[j] - nums[i] > k){
                    break;
                }
                j++;
            }
            while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
            i++;
        }
        return count;
    }
}