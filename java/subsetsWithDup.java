public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        return helper(nums, 0);
    }
    
    private List<List<Integer>> helper(int[] nums, int idx){
        List<List<Integer>> ans = new ArrayList();
        if(idx == nums.length){
            ans.add(new ArrayList());
            return ans;
        }
        
        int i = idx;
        int count = 1;
        while(i+1 < nums.length && nums[i+1] == nums[i]){
            count++;
            i++;
        }
        List<List<Integer>> subsets = helper(nums, i+1);
        
        for(List<Integer> set: subsets){
            ans.add(new ArrayList(set));
            for(int j = 0; j < count; j++){
                set.add(nums[idx]);
                ans.add(new ArrayList(set));
            }
        }
        return ans;
    }
}