public class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-1;
        
        while(i-1 >= 0 && nums[i-1] >= nums[i]) i--;
        
        if(i == 0){
            reverse(nums, 0, nums.length-1);
            return;
        }
        
        assert i >= 1;
        
        int j = nums.length-1;
        int temp = nums[i-1];
        while(j >= 0 && nums[j] <= temp) j--;
        
        swap(nums, i-1, j);
        reverse(nums, i, nums.length-1);
    }
    
    private void swap(int[] nums, int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
    
    private void reverse(int[] nums, int start, int end){
        int mid = (end-start)/2;
        
        for(int i = 0; i <= mid; i++){
            int temp = nums[start+i];
            nums[start+i] = nums[end-i];
            nums[end-i] = temp;
        }
    }
}