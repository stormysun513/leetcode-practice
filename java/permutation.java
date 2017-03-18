public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> buf = new ArrayList();
        boolean[] flags = new boolean[nums.length];
        
        helper(nums, flags, 0, buf, ans);
        return ans;
    }
    
    private void helper(int[] nums, boolean[] flags, int idx, List<Integer> buf, List<List<Integer>> ans){
        if(idx == nums.length){
            ans.add(new ArrayList(buf));
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(flags[i] == false){
                int num = nums[i];
                flags[i] = true;
                buf.add(num);
                helper(nums, flags, idx+1, buf, ans);
                buf.remove(idx);
                flags[i] = false;
            }
        }
    }
}