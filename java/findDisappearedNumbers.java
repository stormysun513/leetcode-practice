public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int length = nums.length;

        for(int i = 0; i < length; i++){
            while(nums[nums[i]-1] != nums[i]) swap(nums, i, nums[i]-1);
        }
        for(int i = 0; i < length; i++){
            if(nums[i] != i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }

    public void swap(int[] nums, int p, int q){
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }
}
