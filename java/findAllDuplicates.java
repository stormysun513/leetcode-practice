public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            while(i != nums[i]-1 && nums[i] > 0 && (nums[i] != nums[nums[i]-1])){
                int temp = nums[i];
                int idx = temp-1;
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
            if(i != nums[i]-1 && nums[i] > 0 && nums[i] == nums[nums[i]-1]){
                ans.add(nums[i]);
                nums[i] = 0;
            }
        }
        /**System.out.println(Arrays.toString(nums));**/
        return ans;
    }
}
