public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length-1;

            while(left < right){

                int sum = nums[left] + nums[right];
                if(sum == target){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < (nums.length-1) && nums[left] == nums[left+1]) left++;
                    while(right > 0 && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }

            }
            while(i < (nums.length-1) && nums[i] == nums[i+1]) i++;
        }
        return ans;
    }
}
