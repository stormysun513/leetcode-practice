public class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length-1, last_min = -1;

        while(i <= j){
            int mid = i + (j - i)/2;

            if(nums[mid] >= target){
                j = mid - 1;
            }
            else{
                i = mid + 1;
                last_min = mid;
            }
        }
        while(last_min+1 < nums.length && nums[last_min+1] < target) last_min++;
        return last_min + 1;
    }
}
